<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>创建数据库</title>
<style type="text/css">
	body{ padding:0; margin:0; background:url(../images/content.png) no-repeat left top; font-family:"宋体"; font-size:15px; color:#666;}
	a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
a:link,a:visited{color:#39F; text-decoration:none; font-size:12px; }
a:hover{ text-decoration:underline;}
li{width:500px; height:50px; line-height:50px;}
.li-1{ background-color:#F5F5F5; padding-left:100px; width:500px;}
.li-2{ background-color:#FFF; padding-left:100px; width:500px;}
input{ margin-left:30px;}
</style>
</head>

<body>
	<h2 style="padding:10px; font-weight:normal; font-size:20px; font-weight:bold;">创建数据库</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
    <form action="${pageContext.request.contextPath }/developer/user_createDB.action" method="post" id="myForm" onsubmit="return validate()">
    	<div style="width:700px; height:350px; margin:20px 10px;">
        <ul style="border:#CCC solid 1px; width:600px; height:202px; margin-left:50px;">
        	<li class="li-1">数据库名:<span style=" margin-left:74px;"></span><s:property value="db_+#session.user.userdb.name"/></li>
            <li class="li-2">数据库登录账号:<input type="text" name="username" id="useName"/></li>
            <li class="li-1">数据库登录密码:<input type="password" name="password" id="password"/></li>
            <li class="li-2"><input type="submit" value="立即申请" style="margin-left:50px;"><input type="reset" value="重置" style="margin-left:95px;"></li>
        </ul>
        </div>
    </form>
<script>
function validate(){
		var x = document.getElementById("useName").value;
		var y = document.getElementById("password").value;
		var s = "";
		var bool = true;
		if(x == null || x == ""){
			s += "账号不能为空！\n";
			document.getElementById("useName").focus();
			bool = false;
		}else if(x.length > 10){
			s += "账号长度错误！\n";
			document.getElementById("useName").focus();
			bool = false;
			}
		if(y == null || y == ""){
			s += "密码不能为空！\n";
			document.getElementById("password").focus();
			bool = false;
		}else if(y.length > 10){
			s += "密码长度错误！\n";
			document.getElementById("password").focus();
			bool = false;
			}
		if(bool)
			return bool;
		else{
			alert(s);
			return bool;
		}
	}	
</script>

</body>
</html>
