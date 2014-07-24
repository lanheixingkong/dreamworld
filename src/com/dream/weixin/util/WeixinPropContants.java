package com.dream.weixin.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 常量类-- 从properties文件中获取
 * @author lakala
 * @classname Contants
 * @time 2014年2月28日上午10:04:02
 * @version
 * @classdesc
 */
public class WeixinPropContants {
	private static Logger logger = LoggerFactory.getLogger(WeixinPropContants.class);
	
	private final static String WEIXIN_PROP_NAME= "weixin_resp_code.properties";
	private static Properties weixin_resp_props=new Properties();
	
	/**
	 * 初始化  微信相应码
	 */
	@PostConstruct
	private static void init(){
		wx_responsecode_init();
	}
	
	/**
	 * 微信相应码
	 */
	private static void wx_responsecode_init(){
		logger.info("****开始加载微信响应码****");
		try {
			weixin_resp_props =	PropertiesUtils.loadProperties(WEIXIN_PROP_NAME);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("****加载微信响应码-结束****");
	}

	/**
	 * 获取
	 * @param key
	 * @return
	 */
	public static String getCCBValu(String key) {
		return key!=null?weixin_resp_props.getProperty(key).trim():null;
	}
	
	
	
	
	
	
	
	/*******************************属性文件中的KEY值*******************************/
	@SuppressWarnings("unused")
	public final static String WEIXIN_KEY_URL="weixin_sendmsg_url";
	
	
	
}
