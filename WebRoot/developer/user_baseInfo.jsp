<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>基本信息</title>
<style type="text/css">
	body{ padding:0; margin:0; background:url(../images/content.png) no-repeat left top; font-family:"宋体"; font-size:15px; color:#666;}
	a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
a:link,a:visited{color:#39F; text-decoration:none; font-size:12px; }
a:hover{ text-decoration:underline;}
li{ float:left; width:300px; height:50px; line-height:50px;}
.li-1{ background-color:#F5F5F5; padding-left:100px; width:200px;}
.li-3{ background-color:#F5F5F5; }
.li-2{ background-color:#FFF; padding-left:100px; width:200px;}
.li-4{ background-color:#FFF;}
</style>
</head>

 <body>
    <h2 style="padding:10px; font-weight:normal; font-size:20px; font-weight:bold;">用户基本信息</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
    <div style="width:700px; height:350px; margin:20px 10px;">
    	<ul style="border:#CCC solid 1px; width:600px; height:352px; margin-left:50px;">
        	<li class="li-1">用户名:</li>
            <li class="li-3"><s:property value="#session.user.username"/></li>          
            <li class="li-2">密码:</li>
            <li class="li-4"><s:property value="#session.user.password"/></li>
            <li class="li-1">昵称:</li>
            <li class="li-3"><s:property value="#session.user.nickname"/></li>
            <li class="li-2">Email:</li>
            <li class="li-4"><s:property value="#session.user.email"/></li>
            <li class="li-1">电话:</li>
            <li class="li-3"><s:property value="#session.user.telephone"/></li>
            <li class="li-2">创建日期:</li>
            <li class="li-4"><s:property value="#session.user.time"/></li>
            <li class="li-1">Token:</li>
            <li class="li-3">
            	<s:if test="#session.user.token==null">
            		<a href="developer/user_getToken.action">点击我立即申请</a>
            	</s:if>
            	<s:else>
            		<s:property value="#session.user.token"/>
            	</s:else>
            </li>
            
        </ul>
    </div>
  </body>
</html>
