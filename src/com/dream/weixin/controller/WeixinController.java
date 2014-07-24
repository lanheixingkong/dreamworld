package com.dream.weixin.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dream.weixin.service.CoreService;
import com.dream.weixin.util.AuthUtils;

/**
 * @author wenmx 
 * 
 */

@Controller
@RequestMapping("/coreCheck.do")
public class WeixinController {

	private static Logger logger = Logger.getLogger(WeixinController.class);

	/**
	 * 微信开发者验证接口
	 * 
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @param echostr
	 * @return echostr
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String get(
			@RequestParam("signature") String signature,
			@RequestParam("timestamp") String timestamp,
			@RequestParam("nonce") String nonce,
			@RequestParam("echostr") String echostr) {
		logger.debug("signature---"+signature);
		logger.debug("timestamp---"+timestamp);
		logger.debug("nonce---"+nonce);
		logger.debug("echostr---"+echostr);
		
		logger.info("auth validation start");
		if (AuthUtils.checkSignature(signature, timestamp, nonce)) {
			return echostr;
		}
		logger.info("Teken validation fails return ''");
		return "";

	}

	/**
	 * 文本信息推送
	 * @param request
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String post(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		// 调用核心业务类接收消息、处理消息  
		logger.info( "调用核心业务类接收消息、处理消息");
		request.setCharacterEncoding("UTF-8");  
	    response.setCharacterEncoding("UTF-8");
	    String responsess = CoreService.processRequest(request);
	    logger.debug("response---"+responsess);
	    responsess = new String(responsess.getBytes("UTF-8"),"ISO8859-1");
		return responsess;

	}
	
	

}
