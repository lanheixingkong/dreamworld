/**
 * 
 */
package com.dream.weixin.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jack
 *
 */

/**
 * 类名称：HttpClientUtil
 * 类描述：(描述此类所在架构中层次，如：某某服务接口实现、某某实体模型、某某工具类等----必填)
 * (这里描述此类业务作用，描述性说明 ----必填）
 * 创建人：litj
 * 创建时间：2013-8-29 上午11:04:03
 * 修改人：
 * 修改时间：2013-8-29 上午11:04:03
 * 修改备注：
 * 
 * @version 1.0.0
 */
public class HttpClientUtil {

	protected static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);

	private static HttpClient httpClient = null;

	public synchronized static HttpClient getHttpClient() {
		if (httpClient == null && !(httpClient instanceof HttpClient)) {
			MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
			// 最大连接数
			connectionManager.setMaxConnectionsPerHost(10);
			// 最大活动连接数
			connectionManager.setMaxTotalConnections(25);
			httpClient = new HttpClient(connectionManager);
		}
		return httpClient;
	}

	/**
	 * 连接测试接口 beat heart
	 * 
	 * @param 通信测试地址
	 *            <strong>url<strong>
	 * @return httpStatus <strong>status=200为正常通信！</strong>
	 */
	public static int testHTTPConnection(String url) {
		int status = 99999;
		GetMethod getMethod = new GetMethod(url);
		HttpClient client = HttpClientUtil.getHttpClient();
		client.getParams().setContentCharset(HTTP.UTF_8);
		client.getParams().setVersion(org.apache.commons.httpclient.HttpVersion.HTTP_1_1);
		// 请求超时
		client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000);
		// 读取超时
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
		try {
			status = client.executeMethod(getMethod);
			if (status != HttpStatus.SC_OK) {
				throw new HttpException("58Http通信异常！请尽快联系对方检测故障！！！");
			}
		} catch (HttpException e) {
			logger.warn("【url=" + url + "】【httpStatus=" + status + "】58接口HTTP连接出现异常！！！:" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			logger.warn("【url=" + url + "】【httpStatus=" + status + "】58接口连接出现IO异常！！！:" + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			logger.warn("【url=" + url + "】【httpStatus=" + status + "】58接口测试通信中系统异常！！！：" + e.getMessage());
			e.printStackTrace();
		} finally {
			getMethod.releaseConnection();
			return status;
		}
	}

	/**
	 * Http Post 请求
	 * 
	 * @param <T>
	 * @param url
	 *            请求地址
	 * @param parameters
	 *            表单参数
	 * @return ResponseBodyString
	 * @throws HttpException
	 * @throws IOException
	 */
//	public static <T> T httpPost(String url, HashMap<String, String> parameters, IHttpMessageProcess<T> responseProcess)
//			throws Exception {
//		logger.info("===========请求接口：" + responseProcess.getInterfaceName() + "===============");
//		logger.info("===========请求URL：" + (url == null ? "" : url) + "===============");
//		if (url == null || parameters == null || "".equals(url))
//			return null;
//		// int test = testHTTPConnection("http://api.58.com/testC");
//		// if(test!=HttpStatus.SC_OK){ throw new Exception();/**连接测试失败*/ }
//		String response = null;
//		// POST 请求
//		PostMethod postMethod = new PostMethod(url);
//		// 填入各个表单域的值
//		Set<String> keySet = parameters.keySet();
//		NameValuePair[] data = new NameValuePair[keySet.size() + 3];
//		int i = 0;
//		for (String key : keySet) {
//			data[i++] = new NameValuePair(key, parameters.get(key));
//		}
//		// System Parameters
//		// data[keySet.size()] = new NameValuePair("v", City58Helper.API_VERSION);
//		// data[keySet.size()+1] = new NameValuePair("cp_key", City58Helper.CP_KEY);
//		// data[keySet.size()+2] = new NameValuePair("format_type", City58Helper.FORMAT_TYPE);
//		// 将表单的值放入postMethod中
//		postMethod.setRequestBody(data);
//		response = httpPostRequest(postMethod);
//		return (T) responseProcess.process(response);
//	}

	/**
	 * 处理httpPost请求，此处为通信异常
	 * 
	 * @param postMethod
	 * @return
	 */
	public static String httpPostRequest(PostMethod postMethod) throws ConnectTimeoutException, HttpException, IOException {
		String response = null;
		int status = 500;
		HttpClient client = HttpClientUtil.getHttpClient();
//		client.setParams(params);
		client.getParams().setContentCharset(HTTP.UTF_8);
		client.getParams().setVersion(org.apache.commons.httpclient.HttpVersion.HTTP_1_1);
		// 请求超时
		client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 60000);
		// 读取超时
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 60000);
		// 设置重试次数
		client.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3/* 三次重试机会 */, false));
		// 执行postMethod
		try {
			status = client.executeMethod(postMethod);
			logger.info(status + "--------状态------------");
			// 处理301，302后继服务
			if (status == HttpStatus.SC_MOVED_PERMANENTLY || status == HttpStatus.SC_MOVED_TEMPORARILY) {
				// 从头中取出转向的地址
				Header locationHeader = postMethod.getResponseHeader("location");
				String location = null;
				if (locationHeader != null) {
					location = locationHeader.getValue();
					logger.warn("The page was redirected to:" + location);
				} else {
					logger.warn("Location field value is null.");
				}
				// return null;
			}
			if (status != HttpStatus.SC_OK) {
				// 失败处理
				logger.warn("--------------http request Failed httpStatus" + status + "-----------------");
				throw new Exception("http请求失败!");
			} else if (status == HttpStatus.SC_OK) {
				logger.info("-------------Http 通信成功-----------------");
				response = postMethod.getResponseBodyAsString();
				logger.info("---------服务器返回值---------:" + response);
			}

		} catch (Exception e) {
			// TODO something
			logger.warn("通信异常", e);
		} finally {
			postMethod.releaseConnection();// 释放连接
			// http通信请求返回信息
			logger.info("Http status=" + status + "||Response:" + response);
		}
		return response;
	}

	/**
	 * httpPostRequestStream(返回stream)
	 * (这里描述这个方法适用条件 – 可选)
	 * 
	 * @param postMethod
	 * @return
	 * @throws ConnectTimeoutException
	 * @throws HttpException
	 * @throws IOException
	 *             返回类型：String
	 * @exception
	 * @since 1.0.0
	 */
	public static String httpPostRequestStream(PostMethod postMethod) throws ConnectTimeoutException, HttpException, IOException {
		logger.warn("--------------into method httpPostRequestStream-----------------");
		InputStream response = null;
		int status = 500;
		/** 返回的xml格式数据 */
		String xml = null;
		HttpClient client = HttpClientUtil.getHttpClient();
		client.getParams().setContentCharset(HTTP.UTF_8);
		client.getParams().setVersion(org.apache.commons.httpclient.HttpVersion.HTTP_1_1);
		// 请求超时
		client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 60000);
		// 读取超时
		client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT, 60000);
		// 设置重试次数
		client.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3/* 三次重试机会 */, false));
		// 执行postMethod
		try {
			status = client.executeMethod(postMethod);
			logger.info(status + "--------状态------------");
			// 处理301，302后继服务
			if (status == HttpStatus.SC_MOVED_PERMANENTLY || status == HttpStatus.SC_MOVED_TEMPORARILY) {
				// 从头中取出转向的地址
				Header locationHeader = postMethod.getResponseHeader("location");
				String location = null;
				if (locationHeader != null) {
					location = locationHeader.getValue();
					logger.warn("The page was redirected to:" + location);
				} else {
					logger.warn("Location field value is null.");
				}
				// return null;
			}
			if (status != HttpStatus.SC_OK) {
				// 失败处理
				logger.warn("--------------http request Failed httpStatus" + status + "-----------------");
				throw new Exception("http请求失败!");
			} else if (status == HttpStatus.SC_OK) {
				logger.info("-------------Http 通信成功--getResponseBodyAsStream--------------");
				response = postMethod.getResponseBodyAsStream();

				xml = HttpClientUtil.getXMLStr(response);
				logger.info("---------服务器返回值-----response----:" + response);
			}

		} catch (Exception e) {
			// TODO something
			logger.warn("通信异常", e);
		} finally {
			postMethod.releaseConnection();// 释放连接
			// http通信请求返回信息
			logger.info("Http status=" + status + "||Response:" + response.toString());
		}
		return xml;
	}

	public static String getXMLStr(InputStream is) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuffer stringBuffer = new StringBuffer();
		String str = "";
		try {
			while ((str = reader.readLine()) != null) {
				stringBuffer.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
		String ts = stringBuffer.toString();
		return ts;
	}

	public static String getProductApi(String URL) {
		try {
			HttpClient client = new HttpClient();
			HttpMethod method = new GetMethod(URL);
			client.executeMethod(method);
			String xml = method.getResponseBodyAsString();
			method.releaseConnection();
			return xml;
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Http Post 请求
	 * 
	 * @param <T>
	 * @param url
	 *            请求地址
	 * @param requestBody
	 * @return T
	 * @throws HttpException
	 * @throws IOException
	 */
	public static <T> T httpPostNoParam(String url, String interfaceName, String action) throws Exception {
		logger.info("===========请求接口：" + interfaceName + "===============");
		logger.info("===========请求URL：" + (url == null ? "" : url) + "===============");
		// int test = testHTTPConnection("http://api.58.com/testC");
		// if(test!=HttpStatus.SC_OK){ throw new Exception();/**连接测试失败*/ }
		String response = null;
		// POST 请求
		PostMethod postMethod = new PostMethod(url);
		postMethod.setRequestHeader("Action", action);
		response = httpPostRequest(postMethod);
		// Object respon = JDTuanHelper.xmlToBean(response, object.getClass());
		// return (T)respon;

		return (T) response;
	}

	public static <T> T httpPostParamStream(String url, String interfaceName, String action) throws Exception {
		logger.info("===========请求接口：" + interfaceName + "===============");
		logger.info("===========请求URL：" + (url == null ? "" : url) + "===============");
		// int test = testHTTPConnection("http://api.58.com/testC");
		// if(test!=HttpStatus.SC_OK){ throw new Exception();/**连接测试失败*/ }
		String response = null;
		// POST 请求
		PostMethod postMethod = new PostMethod(url);
		postMethod.setRequestHeader("Action", action);
		response = httpPostRequestStream(postMethod);

		return (T) response;
	}
}
