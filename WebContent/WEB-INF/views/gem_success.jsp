<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<meta name="format-detection" content="telephone=no" />
<meta
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no"
	name="viewport" id="viewport" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/css.css'/>" />
<title>开店宝社区商城</title>
</head>
<body>

	<div class="mask_main_bg">
		<style type="text/css">
body {
	background: #0c0404
}
</style>
		<div class="top_msg mt20">
			<img src="<c:url value='/resources/images/msg_success.png'/>"
				width="282px">
		</div>
		<div class="succeed_show mt20">
			<img src="<c:url value='/resources/images/icon_success.png'/>"
				width="238px">
			<h1>您的宝码为</h1>
			<div class="bmcode">${gem_code}</div>
			<div class="explain">宝码自领取日起30日内有效。请在有效期内尽快通过微信"兑换服务"功能预订你的专属服务。</div>
		</div>
		<form:form method="post"
			action="/emall_weixin/client/register_service">
			<input name="openid" type="hidden" value="${openid}" />
			<input name="gem_code" type="hidden" value="${gem_code}" />
			<input type="submit" class="masr_btn bd" value="立即兑换服务"/>
		</form:form>
	</div>



</body>
</html>
