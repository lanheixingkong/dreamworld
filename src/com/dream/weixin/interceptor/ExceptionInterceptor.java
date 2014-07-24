package com.dream.weixin.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ExceptionInterceptor extends HandlerInterceptorAdapter {

	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger("ExceptionInterceptor");

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
