package com.dream.weixin.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dream.weixin.model.user.UserInfo;
import com.dream.weixin.model.user.UserList;
import com.dream.weixin.model.wiew.AccessToken;
import com.dream.weixin.model.wiew.Menu;

/**
 * 公众平台通用接口工具类
 * 
 * @author wenmx
 * @date
 */
public class WeixinUtil {
	
	private static Logger log = LoggerFactory.getLogger(WeixinUtil.class);

	// 获取access_token的接口地址（GET） 限200（次/天）
	public final static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	// 菜单创建（POST） 限100（次/天）
	public static String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	//删除菜单
	public static String MENU_DELETE_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	//查询菜单
	public static String MENU_SELECT_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	//客服消息发送  48小时内有效
	public static String SERVICE_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
	//	http请求方式: POST（请使用https协议）
	public static String CREATE_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
	//查询所有分组 http请求方式: GET（请使用https协议）
	public static String GET_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
	//查询用户所在分组
	public static String GET_USER_OF_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
	//修改分组名称
	public static String UPDATE_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
	//移动分组用户
	public static String MOVE_USER_GROUP_URL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
	//获取用户详细信息地址
	public static String GET_USER_INFO_URL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
	//获取关注者列表
	public static String GET_USER_LIST_URL = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&next_openid=NEXT_OPENID";
	
	/**
	 * 发起https请求并获取结果
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestMethod
	 *            请求方式（GET、POST）
	 * @param outputStr
	 *            提交的数据
	 * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
	 */
	public static JSONObject httpRequest(String requestUrl,
			String requestMethod, String outputStr) {
		JSONObject jsonObject = null;
		StringBuffer buffer = new StringBuffer();
		try {
			// 创建SSLContext对象，并使用我们指定的信任管理器初始化
			TrustManager[] tm = { new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new java.security.SecureRandom());
			// 从上述SSLContext对象中得到SSLSocketFactory对象
			SSLSocketFactory ssf = sslContext.getSocketFactory();

			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url
					.openConnection();
			httpUrlConn.setSSLSocketFactory(ssf);

			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			// 设置请求方式（GET/POST）
			httpUrlConn.setRequestMethod(requestMethod);

			if ("GET".equalsIgnoreCase(requestMethod))
				httpUrlConn.connect();

			// 当有数据需要提交时
			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();
				// 注意编码格式，防止中文乱码
				outputStream.write(outputStr.getBytes("UTF-8"));
				outputStream.close();
			}

			// 将返回的输入流转换成字符串
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			jsonObject = JSONObject.fromObject(buffer.toString());
		} catch (ConnectException ce) {
			log.error("Weixin server connection timed out.");
		} catch (Exception e) {
			log.error("https request error:{}", e);
		}
		return jsonObject;
	}

	/**
	 * 获取access_token
	 * 
	 * @param appid
	 *            凭证
	 * @param appsecret
	 *            密钥
	 * @return
	 */
	public static AccessToken getAccessToken(String appid, String appsecret) {
		AccessToken accessToken = null;

		String requestUrl = ACCESS_TOKEN_URL.replace("APPID", appid).replace(
				"APPSECRET", appsecret);
		JSONObject jsonObject = httpRequest(requestUrl, "GET", null);
		// 如果请求成功
		if (null != jsonObject) {
			try {
				accessToken = new AccessToken();
				accessToken.setToken(jsonObject.getString("access_token"));
				accessToken.setExpiresIn(jsonObject.getInt("expires_in"));
			} catch (JSONException e) {
				accessToken = null;
				// 获取token失败
				log.error("获取token失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		}
		return accessToken;
	}

	/**
	 * 创建菜单
	 * 
	 * @param menu
	 *            菜单实例
	 * @param accessToken
	 *            有效的access_token
	 * @return 0表示成功，其他值表示失败
	 */
	public static int createMenu(Menu menu, String accessToken) {
		int result = 0;

		// 拼装创建菜单的url
		String url = MENU_CREATE_URL.replace("ACCESS_TOKEN", accessToken);
		// 将菜单对象转换成json字符串
		String jsonMenu = JSONObject.fromObject(menu).toString();
		log.info("accessToken---"+accessToken);
		log.info(jsonMenu);
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", jsonMenu);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("创建菜单失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("创建菜单成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}

	/**
	 * 删除菜单
	 * @param accessToken
	 * @return
	 */
	public static int deleteMenu(String accessToken) {
		int result = 0;

		// 拼装创建菜单的url
		String url = MENU_DELETE_URL.replace("ACCESS_TOKEN", accessToken);
		log.info("accessToken---"+accessToken);
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("删除菜单失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("删除菜单成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	/**
	 * 删除菜单
	 * @param accessToken
	 * @return
	 */
	public static int selectMenu(String accessToken) {
		int result = 0;

		// 拼装创建菜单的url
		String url = MENU_SELECT_URL.replace("ACCESS_TOKEN", accessToken);
		log.info("accessToken---"+accessToken);
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("删除菜单失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("删除菜单成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	/**
	 * 发送客服消息
	 * @param serviceMessage
	 * @param token
	 * @return
	 */
	public static int sendServiceMessage(String serviceMessage, String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = SERVICE_MESSAGE_URL.replace("ACCESS_TOKEN", token);
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", serviceMessage);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	
	/**
	 * 创建分组
	 * @param serviceMessage
	 * @param token
	 * @return
	 */
	public static int createGroup(String createGroup, String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = CREATE_GROUP_URL.replace("ACCESS_TOKEN", token);
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", createGroup);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	
	
	/**
	 * 获取分组
	 * @param token
	 * @return
	 */
	public static int getGroup(String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = GET_GROUP_URL.replace("ACCESS_TOKEN", token);
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	
	/**
	 * 获取用户所在分组
	 * @param openid
	 * @param token
	 * @return
	 */
	public static int getUserOfGroup(String openid,String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = GET_GROUP_URL.replace("ACCESS_TOKEN", token);
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", openid);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	
	/**
	 * 修改分组名称
	 * @param openid
	 * @param token
	 * @return
	 */
	public static int updateGroupName(String group,String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = UPDATE_GROUP_URL.replace("ACCESS_TOKEN", token);
		
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", group);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	
	/**
	 * 移动用户到所分组
	 * @param userGroup
	 * @param token
	 * @return
	 */
	public static int moveUserToGroup(String userGroup,String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = MOVE_USER_GROUP_URL.replace("ACCESS_TOKEN", token);
		
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", userGroup);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
			
		}

		return result;
	}
	/**
	 * 获取用户详细信息
	 * @param userGroup
	 * @param token
	 * @return
	 */
	public static int getUserInfo(String openid,String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = GET_USER_INFO_URL.replace("ACCESS_TOKEN", token).replaceAll("OPENID", openid);
		
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
				
				UserInfo userInfo = UserInfo.fromJSON(jsonObject);
				
			}
			
		}

		return result;
	}
	
	/**
	 * 获取用户列表
	 * @param nextOpenid
	 * @param token
	 * @return
	 */
	public static int getUserList(String nextOpenid,String token) {
		int result = 0;

		// 拼装创建菜单的url
		String url = GET_USER_LIST_URL.replace("ACCESS_TOKEN", token).replaceAll("NEXT_OPENID", nextOpenid);
		
		
		// 调用接口创建菜单
		JSONObject jsonObject = httpRequest(url, "POST", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息失败 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}else{
				result = jsonObject.getInt("errcode");
				log.error("发送客服消息成功 errcode:{} errmsg:{}",
						jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
				
				UserList userInfo = UserList.fromJSON(jsonObject);
				
			}
			
		}

		return result;
	}
	
	/**
	 * 读取属性文件
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String getPropsValue(String key) throws Exception {  
        Properties props = new Properties();  
        File f = new File("/var/www/weixin/WEB-INF/classes/message.properties");  
        props.load(new FileInputStream(f));  
//             props.load(inputStream);  
        return props.getProperty(key);  
    } 
	
	
}