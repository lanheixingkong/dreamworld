package com.dream.weixin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class ActionInterceptor extends HandlerInterceptorAdapter {
	
	private static Logger logger = Logger.getLogger(ActionInterceptor.class);
	
	@Override  
    public boolean preHandle(HttpServletRequest request,  
            HttpServletResponse response, Object handler) throws Exception {
		logger.info("actionInterceptor start");
		
		
		return true;
	}
	
	
	
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj,
			Exception exception) throws Exception {
	}

	


}
