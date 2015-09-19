<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>在线执行SQL语句</title>
<style type="text/css">
	body{ padding:0; margin:0; background:url(../images/content.png) no-repeat left top; font-family:"宋体"; font-size:15px; color:#666;}
	a,ul,li,p,div,img,h2,h3,span{margin:0; padding:0; list-style:none; border:0;}
	.li-1{ padding-left:100px; width:500px;  height:50px; line-height:50px;}
	.li-2{ padding-left:100px; width:500px;  height:200px; line-height:50px;}
	</style>
</head>

<body>
<h2 style="padding:10px; font-size:20px; font-weight:bold;">在线执行SQL语句</h2>
    <div style="width:700px; height:2px; background-color:#666; margin-left:10px;"></div>
     <form action="${pageContext.request.contextPath }/connection/conn_executeSQL.action" method="post" id="myForm" onsubmit="return velidate()">
     	<div style="width:602px; height:250px; margin:20px 0 0 70px;">
        <ul style="border:#CCC solid 1px; background-color:#F5F5F5;">
        <li class="li-1">请输入要执行的SQL语句，不支持查询:</li>
    	
    	<li class="li-2"><textarea rows="10" cols="45" name="sql" id="sql"></textarea></li>
        
    	<li class="li-1"><input type="submit" value="提交" /></li>
        </ul>
        </div>
    </form>
<script>
 	function validate(){
		var x = document.getElementById("sql").value;
		var s = "";
		var bool = true;
		if(x == null || x == ""){
			s += "您还未输入SQL语句。\n";
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
