<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>云数据库</title>
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
    <h2 style="padding:10px; font-weight:normal; font-size:20px; font-weight:bold;">云数据库</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
    <div style="width:700px; height:350px; margin:20px 10px 0 10px;">
    	<ul style="border:#CCC solid 1px; width:600px; height:352px; margin-left:50px;">
    		<s:if test="#session.user.token==null">
    			<li class="li-1">您还未申请Token</li>
    			<li class="li-3">请您前往"基本信息"页面申请Token</li>
    		</s:if>
    		<s:elseif test="#session.user.userdb==null">
    			<li class="li-1">您还未创建数据库</li>
    			<li class="li-3">
    				<a href="${pageContext.request.contextPath }/developer/createDB.jsp">立即申请数据库</a>
    			</li>
    		</s:elseif>
    		<s:else>
    			<li class="li-1">数据库地址:</li>
	            <li class="li-3">http://192.168.191.1:3306</li>          
	            <li class="li-2">数据库类型:</li>
	            <li class="li-4">MySQL</li>
	            <li class="li-1">数据库名:</li>
	            <li class="li-3"><s:property value="#session.user.userdb.name" /></li>
	            <li class="li-2">数据库登录账号:</li>
	            <li class="li-4"><s:property value="#session.user.userdb.username" /></li>
	            <li class="li-1">数据库登录密码:</li>
	            <li class="li-3"><s:property value="#session.user.userdb.password" /></li>
	            <li class="li-2">数据库创建日期:</li>
	            <li class="li-4"><s:property value="#session.user.userdb.time" /></li>
	            <li class="li-1" style="width:500px; font-size:12px; color:#F33;">您可以使用类似SQLyog这样的工具去连接配置您的数据库</li>     
    		</s:else>
        </ul>
    </div>
  </body>
</html>
