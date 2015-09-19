<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>欢迎使用云操纵</title>
<style type="text/css">
    	body{margin:0; padding:0; font-family:"宋体"; font-size:12px; color:#776969;background-color:#EFF9FE;}
a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
a:link,a:visited{color:#666; text-decoration:none;}
a:hover{ text-decoration:underline;}
    </style>
</head>

<body>
	<div style="height: 600px; width: 1024px; margin:10px auto;">
		<div style="width:100%; text-align: center;">
				<iframe style="height: 100px; width:1024px; margin: 0 auto;" src="admin_top.jsp" scrolling="no" name="TopFrame" frameborder="0"></iframe>
		</div>
		<div style="width: 100%; text-align: center;">
			<div style="width:221px; height:469px; float: left;">
				<iframe frameborder="0" name="LeftFrame" style="width:221px; height:469px;" src="admin_menu.jsp" ></iframe>
			</div>
			<div style="height: 469px;" >
				<iframe frameborder="0" name="MainFrame" style=" width: 803px;height: 469px;" src="user_baseInfo.jsp" ></iframe>
			</div>
		</div>
	</div>
</body>
</html>
