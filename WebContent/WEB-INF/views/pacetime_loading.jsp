<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
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
<style type="text/css">
body {
	background: #0c0404
}
</style>
<title>开店宝社区商城</title>
</head>
<body>

	<div class="top_box_black">
		<div class="top_qmark">
			<a href="/emall_weixin/client/gem_introduce"><img
				src="<c:url value='/resources/images/icon_qmark.png'/>"></a>
		</div>
		<div class="top_qtxt">
			<a href="/emall_weixin/client/gem_introduce">什么是宝码</a>
		</div>
	</div>

	<div class="mask_main_bg">

		<h2>稍等排队中</h2>
		<div class="top_msg mt5">
			<img src="<c:url value='/resources/images/msg_baoma.png'/>"
				width="282px">
		</div>
		<h3>立享限量VIP店主特权</h3>
		<div class="succeed_show mt5">
			<img src="<c:url value='/resources/images/icon_bm.png'/>"
				width="243px">
			<div class="mask_point_icon">
				<img src="<c:url value='/resources/images/icon_point.png'/>"
					width="6px">
			</div>
			<div class="mask_loadbox">
				<div class="laoding_NO">
					<span id="time">603</span>
				</div>
				<img src="<c:url value='/resources/images/icon_load.png'/>"
					width="280px">
			</div>

		</div>
		<h4>排队领取宝码</h4>
		<div class="mask_point_icon">
			<img src="<c:url value='/resources/images/icon_point.png'/>"
				width="6px">
		</div>
	</div>
	<script language="javascript">
		var oTime = document.getElementById('time');
		var oSecs = 603;

		function random(min, max) {

			return Math.floor(min + Math.random() * (max - min));

		}
		function time() {
			var ran = random(20, 40);
			if (oSecs > ran) {
				oSecs -= ran;
			} else {
				oSecs = 0;
			}

			if (oSecs < 0) {
				clearInterval();
				return;
			}

			if (oSecs == 0) {
				clearInterval();
				window.location.href = '/emall_weixin/client/register_home?openid=${openid}';

			}
			oTime.innerHTML = oSecs;
		}
		setInterval(time, 1000)
	</script>
</body>
</html>
