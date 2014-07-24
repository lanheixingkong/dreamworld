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
<meta name="format-detection" content="telephone=no"/>
<meta content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0,user-scalable=no" name="viewport" id="viewport" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/css.css'/>"/>
<script type="text/javascript">
function isNotMax(oinput){
if( oinput.value.length >oinput.getAttribute("maxlength")){
return oinput.value.substring(0,oinut.getAttribute("maxlength"));
}else{
return oinput.value;
}
}
</script>
<title>开店宝社区商城</title>
</head>
<body>


<div class="main_bg">
	<div class="top_s">
    	<img src="<c:url value='/resources/images/top_slogan.png'/>">
    </div>
    <div class="top_show bg_c01">
    	<img src="<c:url value='/resources/images/f_1.png'/>">
    </div>
	<div class="top_box color_topbg1">
    	<div class="top_qmark">
            <a href="/emall_weixin/client/gem_introduce"><img src="<c:url value='/resources/images/icon_qmark.png'/>"></a>
      </div>
        <div class="top_qtxt">
        	<a href="/emall_weixin/client/gem_introduce">什么是宝码</a>
        </div>
    </div>
    
    <div class="main_box color_bg1">
    	<div class="main_s"><img src="<c:url value='/resources/images/main_slogan.png'/>"></div>
        <div class="main_icon"><img src="<c:url value='/resources/images/icon_arrow.png'/>"></div>
        <div class="main_content">
        	<form:form method="post" action="/emall_weixin/client/submit_psam">
        	<input name="openid" type="hidden" value="${openid}"/>
        	<h1>PSAM ID号后六位:</h1>
            <ul class="fill_box">
            	<li class="border_b"><span>CBC8D8A800</span><input name="psam" type="text" class="code_textbox" maxlength="6"/><div class="txt_tag">PSAM ID号为开店宝背面16位串码</div></li>
            </ul>
            <h1>输入QQ号，立享限量宝码专属领取通道</h1>
            <ul class="fill_box">
            	<li class="border_nb"><input name="qq_code" type="text" class="code_textbox_02"></li>
            </ul>
            <div class="bottombox">
                
                <div class="btnbox_area">
                <button class="btnbox btnbox_color_01" value="tijiao" type="submit"/>
                	
                </div>
                
            </div>
            </form:form>
        </div>
        
    </div>
    
</div>

</body>
</html>
