package com.dream.weixin.interceptor;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.dream.weixin.db.mysql.entity.OpenidMobile;
import com.dream.weixin.db.mysql.entity.OpenidMobileExample;
import com.dream.weixin.db.mysql.manager.OpenidMobileMapper;
import com.dream.weixin.util.WebUtils;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	private static Logger logger = Logger.getLogger(AuthInterceptor.class);

	@Resource
	private OpenidMobileMapper openidMobileMapper;

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		logger.info("authInterceptor start");
		logger.info(request.getServletPath() + "   :   "
				+ request.getContentType() + "  :  " + request.getContextPath());
		String servletPaht = request.getServletPath();
		String openid = WebUtils.getStringValue(request, "openid");
		String moType = WebUtils.getStringValue(request, "moType");

		if ("/order/countorder.action".equals(servletPaht)) {

			OpenidMobileExample omExample = new OpenidMobileExample();

			omExample.createCriteria().andOpenidEqualTo(openid)
					.andMoTypeEqualTo(moType);
			List<OpenidMobile> openidMobiles = openidMobileMapper
					.selectByExample(omExample);
			if (openidMobiles.size() > 0) {
				return true;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(request.getContextPath());
			sb.append("/auth/authopenid.action");

			response.sendRedirect(sb.toString());

		}

		return true;

	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object obj, Exception exception)
			throws Exception {
		logger.info("authInterceptor end");
	}

}
