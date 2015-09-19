<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
    	body{margin:0; padding:0; font-family:"宋体"; font-size:12px; color:#776969;}
a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
a:link,a:visited{color:#347dbb; text-decoration:none;}
a:hover{ text-decoration:underline;}
li{width:170px; height:40px; background-color:#D8EDF9; margin-top:1px; color:#347dbb; font-size:16px; font-weight:bold; padding-left:45px; line-height:40px;}
    </style>
</head>

<body>
<div style="width: 221px; height: 469px; background-image: url(../images/list.png)">
    	<div style="padding-left:3px; padding-top: 61px;">
	    	<ul>
            	<li><a href="user_baseInfo.jsp" target="MainFrame">基本信息</a></li>
                <li><a href="user_DBInfo.jsp" target="MainFrame">云数据库</a></li>
                <li><a href="${pageContext.request.contextPath }/developer/user_accessCount.action" target="MainFrame">云统计</a></li>
                <li><a href="executeSQL.jsp" target="MainFrame">在线执行SQL</a></li>
                <li><a href="leaveMessage.jsp" target="MainFrame">留言建议</a></li>
	    	</ul>
    	</div>
    </div>
</body>
</html>
