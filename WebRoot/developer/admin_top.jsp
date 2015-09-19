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
		a:link,a:visited{color:#FFF; text-decoration:none;}
		a:hover{ text-decoration:underline;}
</style>
<script type="text/javascript">
	function turn(){
		window.parent.location.href = "${pageContext.request.contextPath}/developer/logout";
	}
</script>
</head>

<body>
<div style="height:100px; width:1024px; background-image:url(../images/top.png)">
    	<div style="text-align: right; margin-right: 22px; padding-top:75px; color:#FFF;">
    		<label>
    			<font style="font-size: 14px;">欢迎您:<s:property value="#session.admin.nickname" /></font>&nbsp;&nbsp;
    			&nbsp;
    			<a href="javascript:turn()">
    				<font style="font-size: 14px;">注销登录</font>
    			</a>
    		</label>
    	</div>
    </div>
</body>
</html>
