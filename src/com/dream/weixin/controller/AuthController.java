package com.dream.weixin.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dream.weixin.model.exception.ServiceException;
import com.dream.weixin.service.AuthService;

@Controller
@RequestMapping("/auth")
public class AuthController {

	private static Logger logger = Logger.getLogger(AuthController.class);

	@Autowired
	private AuthService authService;

	/**
	 * 权限验证页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/authopenid.do")
	public ModelAndView authopenid() {

		logger.info("start flesh authopenid");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("auth_check");

		return mav;
	}

	/**
	 * 
	 * @param mobile
	 * @return 发送状态
	 */
	@RequestMapping(value = "/sendSms.do", params = { "mobile" })
	@ResponseBody
	public Map<String, Object> queryorderlists(
			@RequestParam("mobile") String mobile) {

		/*
		 * 1.生成短信验证码 2.存入 sms表 3.发送短信 4.更新 sms 发送状态
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "fail");
		map.put("content", "");

		// String verifyCode = StringUtil.createVerifyCode();
		String verifyCode = "8888";
		String smsType = "";
		try {
			authService.insertVerifyCode(mobile, smsType, verifyCode);
		} catch (ServiceException e) {
			logger.error(e.getStackTrace(), e);
		} catch (ParseException e) {
			logger.error(e.getStackTrace(), e);
		}
		String returnStr = authService.sendSms(mobile, verifyCode);

		if ("00".equals(returnStr)) {
			authService.updateSendStatusToSucc(mobile, verifyCode);
			map.put("result", "succ");
		}

		return map;

	}

	/**
	 * 
	 * @param mobile
	 * @return 发送状态
	 */
	@RequestMapping(value = "/revelanceOpenid.do", params = { "openid",
			"mobile", "code", "omType" })
	@ResponseBody
	public Map<String, Object> queryorderlists(
			@RequestParam("openid") String openid,
			@RequestParam("mobile") String mobile,
			@RequestParam("code") String code,
			@RequestParam("omType") String omType) {

		/*
		 * 1.验证短信验证码 2.关联openid和mobile 
		 */
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", "fail");
		map.put("content", "");

		
		try {
			authService.revelanceOpenId(mobile, openid, code, omType);
			
		} catch (ServiceException e) {
			map.put("result", "fail");
		}

		return map;

	}

}
