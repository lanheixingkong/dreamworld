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

	<div class="main_bg">
		<div class="top_s">
			<img src="<c:url value='/resources/images/top_slogan.png'/>">
		</div>
		<div class="top_show bg_c02">
			<img src="<c:url value='/resources/images/f_1_error.png'/>">
		</div>
		<div class="top_box color_topbg5">
			<div class="top_qmark">
				<a href="/emall_weixin/client/gem_introduce"><img
					src="<c:url value='/resources/images/icon_qmark.png'/>"></a>
			</div>
			<div class="top_qtxt">
				<a href="/emall_weixin/client/gem_introduce">什么是宝码</a>
			</div>
		</div>

		<div class="main_box color_bg5">
			<div class="Overdue_box">
				<h2>
					您好，您输入的宝码已过期<br>你可以
				</h2>
			</div>
			<div class="main_icon">
				<img src="<c:url value='/resources/images/icon_arrow.png'/>">
			</div>
			<form:form method="post"
				action="/emall_weixin/client/contact_gem_code">
				<input name="openid" type="hidden" value="${openid}" />
				<div class="select_area">
					<label for="1"><input name="contact_type" type="radio"
						id="1" value="new" checked><span>重新申领限量宝码</span></label> <label
						for="2"><input name="contact_type" type="radio"
						value="contract" id="2"><span>续约该宝码服务,服务有效为自续约成功后30天内有效</span></label>
				</div>


				<div class="main_content mt30">
					<div class="bottombox mt50">


						<button class="btnbox btnbox_color_04" value="tijiao"
							type="submit" />


					</div>
				</div>
			</form:form>
		</div>

	</div>




</body>
</html>
