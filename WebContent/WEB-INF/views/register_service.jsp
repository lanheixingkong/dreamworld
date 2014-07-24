<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
<script language="javascript" src="<c:url value='/resources/js/jq.js'/>"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".CheckBoxClass").change(function() {
			if ($(this).is(":checked")) {
				$(this).next("label").addClass("LabelSelected checkfont");
			} else {
				$(this).next("label").removeClass("LabelSelected checkfont");
			}
		});

		$(".disableClass").change(function() {
			if ($(this).is(":checked")) {
				$(this).next("label").addClass("Labeldisable checkfont");
			} else {
				$(this).next("label").removeClass("Labeldisable checkfont");
			}
		});
	});
</script>
<title>开店宝社区商城</title>
</head>
<body>


	<div class="main_bg">
		<div class="top_s">
			<img src="<c:url value='/resources/images/top_slogan.png'/>">
		</div>
		<div class="vip_top_box color_topbg6">
			<div class="top_info">
				<img src="<c:url value='/resources/images/f_2.png'/>" width="58px">

				<div class="infotxt">您是${gem_grade_str}，共有${prop_list_size}项服务可选，请勾选您需要预订的服务：</div>
			</div>
		</div>
		<form:form method="post"
			action="/emall_weixin/client/submit_service">
			<div class="main_box color_bg6">
				<div class="vip_arrowicon">
					<img src="<c:url value='/resources/images/icon_arrow2.png'/>"
						width="16px">
				</div>
				<input name="openid" type="hidden" value="${openid}" />
				<ul class="vip_info">
					<c:forEach var="pro" items="${prop_list }" varStatus="stat">

						<c:choose>
							<c:when test="${pro.psamPropParser <= gem_grade }">
								<li><input id="CheckBox${stat.count }" type="checkbox" checked="checked"
									class="CheckBoxClass" value="${pro.psamPropId }"
									name="user_prop" /><label id="Label${stat.count}"
									for="CheckBox${stat.count }" class="CheckBoxLabelClass LabelSelected checkfont"><h1>${pro.psamPropDesc
											}</h1></label></li>
							</c:when>

							<c:otherwise>
<li><input id="CheckBox${stat.count }" type="checkbox"
									class="disableClass " value="${pro.psamPropId }"
									name="user_prop" disabled/><label id="Label${stat.count}"
									for="CheckBox${stat.count }" class="CheckBoxdisableClass"><h1>${pro.psamPropDesc
											}</h1></label></li>
							</c:otherwise>
						</c:choose>
					</c:forEach>

				</ul>

				<div class="main_content">
					<div class="bottombox">
						<input name="tijiao" type="submit" class="btnbox_vip btnbox_color_05" value="">
					</div>
				</div>
		</form:form>
	</div>

	</div>
</body>
</html>
