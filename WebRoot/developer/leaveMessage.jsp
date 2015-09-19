<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>留言页面</title>
<style type="text/css">
	body{ padding:0; margin:0; background:url(../images/content.png) no-repeat left top; font-family:"宋体"; font-size:15px; color:#666;}
	a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
	.li-1{ padding-left:100px; width:500px;  height:50px; line-height:50px;}
	.li-2{ padding-left:0px; width:500px;  height:200px; line-height:50px;}
	li{ float:left; width:300px; height:50px; line-height:50px;}
	</style>
</head>

<body>
<h2 style="padding:10px; font-size:20px; font-weight:bold;">留言</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
     <form action="${pageContext.request.contextPath }/connection/conn_executeSQL.action" method="post" id="myForm" onsubmit="return validate()">
     	<div style="width:602px; height:350px; margin:20px 0 0 70px;">
        <ul style="border:#CCC solid 1px; background-color:#F5F5F5; width:602px; height:350px; padding-left:15px;">
        <li>姓名：<input type="text"name="name" style="margin-left:10px;" id="name"/></li>
        <li>电话：<input type="text"name="telephone" style="margin-left:30px;"/></li>
        <li>Email: <input type="text"name="email" /></li>
        <li>公司地址: <input type="text"name="address" /></li>
    	
    	<li class="li-2"><textarea rows="10" cols="45" name="content"></textarea></li>
        
    	<li class="li-1"><input type="submit" value="提交" /> <input type="reset" value="重置" /></li>
        </ul>
        </div>
    </form>
<script>
	function velidate(){
		var x = document.getElementById("name").value;
		var s = "";
		var bool = true;
		if(x == null || x == ""){
			s += "请您输入姓名。\n";
			bool = false;
		}else if (x.length > 6){
			s += "您输入的姓名超过范围（范围为1~6）。"
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
