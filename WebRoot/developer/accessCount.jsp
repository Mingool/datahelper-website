<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>统计页面</title>
<style type="text/css">
	body{ padding:0; margin:0; background:url(../images/content.png) no-repeat left top; font-family:"宋体"; font-size:15px; color:#666;}
	a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
a:link,a:visited{color:#39F; text-decoration:none; font-size:12px; }
a:hover{ text-decoration:underline;}
.li-1{ background-color:#F5F5F5; padding-left:100px; width:500px;  height:50px; line-height:50px;}
.li-2{ background-color:#FFF; padding-left:100px; width:500px;  height:50px; line-height:50px;}
</style>
</head>

<body>
	<h2 style="padding:10px; font-size:20px; font-weight:bold;">创建数据库</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
    <ul style="border:#CCC solid 1px; width:600px; height:102px; margin-left:50px; margin-top:20px;">
    	<li class="li-1">您的query接口总共被访问了<s:property value="query_num"/>次.</li>
        <li class="li-2">您的update接口总共被访问了<s:property value="update_num"/>次.</li>
    </ul>
</body>
</html>
