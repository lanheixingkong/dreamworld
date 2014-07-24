<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache, must-revalidate">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<meta name="format-detection" content="telephone=no"/>
<meta content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no" name="viewport" id="viewport" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/css.css'/>"/>
<script language="javascript" src="<c:url value='/resources/js/jq.js'/>"></script>
<script type="text/javascript">
$(document).ready(function(){
  $("#show").click(function(){
  $("#mask").show();
  });
   $("#mask").click(function(){
  $("#mask").hide();
  });
});
</script>
<title>开店宝社区商城</title>
</head>
<body>

<div class="mask_main_bg">
	<div class="mask_share" id="mask" style="display:none">
    	<div class="share_txt">点击这里分享给您的朋友吧 <img src="<c:url value='/resources/images/icon_arrow3.png'/>" width="30px"></div>
        <div class="share_bg"></div>
    </div>
	<style type="text/css">body{ background:#0c0404}</style>
    <h2>什么是</h2>
    <div class="top_msg mt5">
    	<img src="<c:url value='/resources/images/msg_baoma.png'/>" width="282px">
    </div>
    <h3>立享限量VIP店主特权</h3>
    <div class="succeed_show mt5">
       	  <img src="<c:url value='/resources/images/icon_bm.png'/>" width="243px">
    </div>
    <div class="helpbox">
    	<p><span>宝码是VIP店主特权限量邀请码，是店主VIP身份象征。</span></p>
<p>拥有它，助你票子翻几番、店铺遍全国、当上总经理、出任CEO、迎娶白富美、走上人生巅峰。</p>

<ul>
<li>每月通过微信预约限量宝码，专享VIP店主专属特权：</li>
<li>1.店铺经营秘籍</li>
<li>2.限量返现特权</li>
<li>3.店铺销量义诊</li>
<li>4.店主大联盟</li>
<li>5.赚钱经营分享</li>
<li>6.一对一专人服务</li>
<li>等多于几十种特权内容，数量有限，一般人我不告诉~</li>
</ul>

    </div>
     <a href="javascript:void(0)" id="show">
    <div class="masr_btn" >
    	分享
    </div>
    </a>
</div>



</body>
</html>
