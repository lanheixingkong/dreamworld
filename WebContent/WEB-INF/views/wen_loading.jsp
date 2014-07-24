<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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


	<div class="mask_main_bg">


		<div class="top_box_blace">
			<div class="top_qmark">
				<a href="/emall_weixin/client/gem_introduce"><img
					src="<c:url value='/resources/images/icon_qmark.png'/>"></a>
			</div>
			<div class="top_qtxt">
				<a href="/emall_weixin/client/gem_introduce">什么是宝码</a>
			</div>
		</div>
		<div class="top_msg mt20">
			<img src="<c:url value='/resources/images/msg_baoma.png'/>"
				width="282px">
		</div>


		<h3>立享限量VIP店主特权</h3>
		<div class="succeed_show mt5">
			<div class="mask_point_icon">
				<img src="<c:url value='/resources/images/icon_point.png'/>"
					width="6px">
			</div>
			<div class="mask_loadbox">
				<div class="laoding_NO_02">
					<span id="time">603</span>
				</div>
				<img src="<c:url value='/resources/images/icon_load02.png'/>"
					width="280px">
			</div>

		</div>
		<h4>申请领取宝码</h4>
		<h5>现在加入QQ群，更多机会抢得限量宝码</h5>
		<div class="maskbottom">
			<div class="Maskqqbox">
				<div class="MqqNO">
					<img src="<c:url value='/resources/images/icon_QQ.png'/>"
						width="27px">

					<c:choose>
						<c:when test="${gemGrade == 1 }">
							<span class="QQ">367119169</span>
						</c:when>
						<c:when test="${gemGrade == 2 }">
							<span class="QQ">339160772</span>
						</c:when>
						<c:otherwise>
							<span class="QQ">361130450</span>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
		<div class="mask_point_icon">
			<img src="<c:url value='/resources/images/icon_point.png'/>"
				width="6px">
		</div>
		<ul class="welfare">
			<li>群福利：</li>
			<li>1、限量特权：VIP店主特权抢先体验</li>
			<li>2、绿色通道：商城大管家随时恭候</li>
			<li>3、经营指导：经营数据分析、赚钱经验分享</li>
		</ul>

	</div>

	<script language="javascript">
		var oTime = document.getElementById('time');
		var oSecs = 603;

		function random(min, max) {

			return Math.floor(min + Math.random() * (max - min));

		}
		function time() {
			var ran = random(2, 5);
			if (oSecs > ran) {
				oSecs -= ran;
			} else {
				oSecs = 0;
			}
			if (oSecs < 200) {
				oSecs = 507;
			}

			if (oSecs < 0) {
				clearInterval();
				return;
			}

			if (oSecs == 0) {
				clearInterval();
				window.location.href = '';
				//alert(1)
			}
			oTime.innerHTML = oSecs;
		}
		setInterval(time, 1000)
	</script>

</body>
</html>
