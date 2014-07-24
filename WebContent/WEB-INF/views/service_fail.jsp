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
	<div class="top_box color_topbg3">
    	<div class="top_qmark">
            <a href="/emall_weixin/client/gem_introduce"><img src="<c:url value='/resources/images/icon_qmark.png'/>"></a>
        </div>
        <div class="top_qtxt">
        	<a href="/emall_weixin/client/gem_introduce">什么是宝码</a>
        </div>
    </div>
    
    <div class="main_box color_bg3">
    	<div class="prompt_box">
        	<h2>很抱歉，您未通过验证。</h2>
            <p>请核对您输入的PSAM ID号/宝码是否正确。</p>
        </div>
        <div class="main_content mt10">
        	<h1>PSAM ID号如下图所示</h1>
            
            <div class="code_img">PSAM ID号：<span>CBC8D8A800023733</span></div><div class="txt_tag_02">PSAM ID号为开店宝背面16位串码</div>
            <div class="bottombox mt40">
                <a href="/emall_weixin/client/login_service?openid=${openid }">
                <div class="btnbox btnbox_color_03">
                	<div class="btn_bg"><div class="btn_txt"><img src="<c:url value='/resources/images/btn_icon_03.png'/>" width="150px"><p>返回兑换服务</p></div></div>
                </div>
                </a>
            </div>
        </div>
        
    </div>
    
</div>

</body>
</html>
