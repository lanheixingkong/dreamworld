package com.dream.weixin.controller;

import java.util.Calendar;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dream.weixin.common.Business;
import com.dream.weixin.common.Constant;
import com.dream.weixin.model.exception.ServiceException;
import com.dream.weixin.service.ClientService;

@Controller
@RequestMapping("/client")
public class ClientController {

	private static Logger logger = Logger.getLogger(ClientController.class);

	@Autowired
	private ClientService clientService;

	/**
	 * 什么是宝码
	 * 
	 * @return
	 */
	@RequestMapping(value = "/gem_introduce.do")
	public ModelAndView gemIntroduce() {
		logger.info("start flesh gem_introduce");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("gem_introduce");
		return mav;
	}

	/**
	 * 我要宝码
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register_home.do", params = { "openid" })
	public ModelAndView gainPsam(@RequestParam("openid") String openid) {
		logger.info("start flesh regisrer_home");
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid", openid);
		try {
			// 验证宝码是否存在，且在有效期
			clientService.validGemCode(openid);
			mav.setViewName("register_home");
			
		} catch (ServiceException e) {
			logger.error(e.getType(), e);
			if (ServiceException.GEMEFFECT.equals(e.getType())) {
				mav.addObject("gem_code", e.getMessage());
				mav.setViewName("gem_success");
			}else if(ServiceException.GEMEFFECTNOTWEN.equals(e.getType())){
				mav.addObject("gemGrade", e.getMessage());
				mav.setViewName("wen_loading");
			}

		}
		return mav;
	}

	/**
	 * 提交psam卡号
	 * 
	 * @param openid
	 * @param psam
	 * @return
	 */
	@RequestMapping(value = "/submit_psam.do", params = { "openid", "psam",
			"qq_code" })
	public ModelAndView submitPsam(@RequestParam("openid") String openid,
			@RequestParam("psam") String psam,
			@RequestParam("qq_code") String qqCode) {
		logger.info("start flesh submit_psam");
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid", openid);
		try {
			if (psam == null || psam.equals("") || qqCode == null
					|| qqCode.equals("")) {
				mav.setViewName("register_fail");
				return mav;
			}
			Map<String,String> map = clientService.submitPsam(openid, psam,
					qqCode);
			mav.addAllObjects(map);
			mav.setViewName("wen_loading");

			Calendar cl = Calendar.getInstance();
			int weekOfDay = cl.get(Calendar.DAY_OF_WEEK);
			if (weekOfDay == 4) {
				mav.setViewName("pacetime_loading");
			}

		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			if (ServiceException.PSAMISNOTFOUND.equals(e.getType())) {
				mav.setViewName("register_fail");
			} else if (ServiceException.GEMEFFECT.equals(e.getType())) {
				mav.addObject("gem_code", e.getMessage());
				mav.setViewName("gem_success");
			}else if(ServiceException.LESSTENORDERS.equals(e.getType())){
				
			}
		}

		return mav;
	}

	/**
	 * 选择服务
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login_service.do", params = { "openid" })
	public ModelAndView loginService(@RequestParam("openid") String openid) {
		logger.info("start flesh gem_code");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login_service");
		mav.addObject("openid", openid);
		return mav;
	}

	/**
	 * 续约
	 * 
	 * @return
	 */
	@RequestMapping(value = "/contact_gem_code.do", params = { "openid" })
	public ModelAndView contactGemCode(@RequestParam("openid") String openid,
			@RequestParam("contact_type") String contactType) {
		logger.info("start flesh gem_code");
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid", openid);
		if ("new".equals(contactType)) {
			mav.setViewName("register_home");
		} else {
			Map<String, Object> map = clientService.contactGemCode(openid);
			mav.setViewName("gem_success");
			mav.addAllObjects(map);

		}

		return mav;
	}

	/**
	 * 提交psam卡号
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register_service.do", params = { "openid",
			"psam", "gem_code" })
	public ModelAndView submitGemCode(@RequestParam("openid") String openid,
			@RequestParam("psam") String psam,
			@RequestParam("gem_code") String gemCode) {
		logger.info("start flesh submit_gem_code");
		psam = Business.HEADPSAM + psam;
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid", openid);
		
		try {
			Map<String, Object> map = clientService.submitGemCode(openid, psam,
					gemCode);
			mav.addAllObjects(map);
			mav.setViewName("register_service");

		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			if(ServiceException.INFOISNOTFOUND.equals(e.getType())){
				mav.setViewName("service_fail");
			}else if(ServiceException.VERIFYCODE_INVALID.equals(e.getType())){
				mav.setViewName("gem_over");
			}
		}

		return mav;
	}

	/**
	 * 提交psam卡号
	 * 
	 * @return
	 */
	@RequestMapping(value = "/register_service.do", params = { "openid","gem_code" })
	public ModelAndView submitGemCode(@RequestParam("openid") String openid,
			@RequestParam("gem_code") String gemCode) {
		logger.info("start flesh submit_gem_code");
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid", openid);
		try {
			Map<String, Object> map = clientService.submitGemCode(openid,
					gemCode);
			mav.addAllObjects(map);
			mav.setViewName("register_service");

		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			if(ServiceException.INFOISNOTFOUND.equals(e.getType())){
				mav.setViewName("service_fail");
			}else if(ServiceException.VERIFYCODE_INVALID.equals(e.getType())){
				mav.setViewName("gem_over");
			}
		}

		return mav;
	}

	/**
	 * 提交psam卡号
	 * 
	 * @return
	 */
	@RequestMapping(value = "/submit_service.do", params = { "openid",
			"user_prop" })
	public ModelAndView submitService(@RequestParam("openid") String openid,
			@RequestParam("user_prop") Integer[] userProps) {
		logger.info("start flesh submit_service");
		for (Integer string : userProps) {
			logger.info("str :" + string);
		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("openid",openid);
		try {
			clientService.submitService(openid,
					userProps);
			mav.setViewName("service_success");
		} catch (ServiceException e) {
			if (ServiceException.INFOISNOTFOUND.equals(e.getType())) {
				mav.setViewName("gem_over");
			}
		}

		return mav;
	}
}
