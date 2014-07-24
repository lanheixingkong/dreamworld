package com.dream.weixin.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dream.weixin.common.Business;
import com.dream.weixin.util.HttpXmlClient;
import com.dream.weixin.util.MD5Utils;

@Controller
@RequestMapping("/order")
public class OrderController {

	private static Logger logger = Logger.getLogger(OrderController.class);
	
	@RequestMapping(value = "/queryorderlists.do", params = { "openid",
			"uname", "status", "wclient", "page_no", "page_size", "userKey",
			"token" })
	@ResponseBody
	public String queryorderlists(@RequestParam("openid") String openid,
			@RequestParam("uname") String uname,
			@RequestParam("status") String status,
			@RequestParam("wclient") String wclient,
			@RequestParam("page_no") String page_no,
			@RequestParam("page_size") String page_size,
			@RequestParam("userKey") String userKey,
			@RequestParam("token") String token) {

		String url = Business.BASEURL + "index.php/openapi/order/order_list";
		String xml = "";

		String[] arr = new String[] { page_size, openid, page_no, status,
				uname, userKey };
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		logger.info("content:   " + content.toString());
		String contentMd5 = MD5Utils.getMD5(content.toString());
		logger.info("contentMd5:   " + contentMd5);
		token = contentMd5.substring(5, 25);
		logger.info("token:   " + token);

		Map<String, String> params = new HashMap<String, String>();
		params.put("openid", openid);
		params.put("uname", uname);
		params.put("status", status);
		params.put("wclient", wclient);
		params.put("page_no", page_no);
		params.put("page_size", page_size);
		params.put("userKey", userKey);
		params.put("token", token);
		xml = HttpXmlClient.post(url, params);

		return xml;

	}
	/**
	 * 订单查询
	 * @return
	 */
	@RequestMapping(value="/countorder.do")
	public ModelAndView countorder(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("order_query");
		return mav;
	}
	/**
	 * 订单列表
	 * @return
	 */
	@RequestMapping(value="/order_info.do")
	public ModelAndView orderInfo(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("order_info");
		return mav;
	}
	/**
	 * 订单详情
	 * @return
	 */
	@RequestMapping(value="/order_list.do")
	public ModelAndView orderList(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("order_list");
		return mav;
	}
	/**
	 * psam
	 * @return
	 */
	@RequestMapping(value="/psam.do")
	public ModelAndView psam(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("psam");
		return mav;
	}
	
	/**
	 * psam_success
	 * @return
	 */
	@RequestMapping(value="/psam_success.do")
	public ModelAndView psamSuccess(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("psam_success");
		return mav;
	}
	
	/**
	 * psam_error
	 * @return
	 */
	@RequestMapping(value="/psam_error.do")
	public ModelAndView psamError(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("psam_error");
		return mav;
	}
	
	/**
	 * psam_success1
	 * @return
	 */
	@RequestMapping(value="/psam_success1.do")
	public ModelAndView psamSuccess1(){
		logger.info("start flesh countorder");
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "nihao");
		mav.setViewName("psam_success1");
		return mav;
	}
	
	
}
