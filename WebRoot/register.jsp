<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册账号</title>
<link href="css/register.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="topBig">
		<div id="topSmall">
			<span><img src="images/top-1.png" width="16" height="16" /><a
				class="collect" href="#">收藏页面</a> </span> <span class="choose">你好，<a
				href="javascript:void(0);">请登录</a> <a href="register.jsp">免费注册</a> | <a href="#">客户服务</a>
				| <a href="javascript:void(0);">网站导航</a> </span>
		</div>
	</div>
	<div id="logo">
		<ul>
			<li class="logo1"></li>
			<li class="logo2"><img src="images/line-1.jpg" width="2"
				height="60" />
			</li>
			<li class="logo3">欢迎注册</li>
		</ul>
	</div>
	<div id="table">
		<form action="${pageContext.request.contextPath }/regist.action" name="" method="post" id="giraffe_form">
			<div class="input">
				<span class="name-1"><span class="red"> * </span>用户名：</span> <input
					type="text" name="username" maxlength="14" class="in-1"  id="useName"/> <span
					class="picture-1"></span>
			</div>
			<div class="input">
				<span class="name-2"><span class="red"> * </span>请设置密码：</span> <input
					type="password" name="password1" maxlength="12" class="in-2" id="passwordOne" /> <span
					class="picture-2"></span>
			</div>
			<div class="input">
				<span class="name-2"><span class="red"> * </span>请确认密码：</span> <input
					type="password" name="password" maxlength="12" class="in-2" id="passwordTwo"/> <span
					class="picture-2"></span>
			</div>
			<div class="input">
				<span class="name-3"><span class="red"> * </span>昵称：</span> <input
					type="text" name="nickname" maxlength="16" class="in-1" id="name"/>
			</div>
			<div class="input">
				<span class="name-3"><span class="red"> * </span>邮箱：</span> <input
					type="text" name="email" maxlength="20" class="in-1" />
			</div>
			<div class="input">
				<span class="name-4"><span class="red"> * </span>手机号码：</span> <input
					type="text" name="telephone" maxlength="16" class="in-1" /> <span
					class="picture-3"></span>
			</div>
			<div class="input">
				<input type="checkbox" name="ccc" value="" id="y" checked="checked" />
				<span class="name-5">我已经同意了<a href="about/about2.jsp">《云数据操纵助手章程》</a>
				</span>
			</div>
			<div class="login">
				<a class="enter" href="javascript:validate();" onclick="javascript:velidate();"></a>
			</div>
			<div>
				<s:fielderror></s:fielderror>
			</div>
		</form>
		<span class="picture-4"><img src="images/in-4.png" width="182"
			height="182" /> </span>
	</div>
	<div id="footer">
		<p class="footer1">
			<a href="about/about1.jsp" target="_blank">关于我们</a> <a
				href="about/about2.jsp" target="_blank">法律声明</a> <a
				href="about/about3.jsp" target="_blank">友情链接</a>
		</p>
		<p class="footer2">
			<a href="http://www.hebut.edu.cn/" target="_blank">河北工业大学</a> <a
				href="http://jwc.hebut.edu.cn/" target="_blank">教务处</a> <a
				href="http://xyh.hebut.edu.cn/xyw/" target="_blank">校友网</a> <a
				href="http://xchb.hebut.edu.cn/main.asp?tid=3" target="_blank">媒体工大</a>
			<a href="http://xsc.hebut.edu.cn/jiuye/index.asp" target="_blank">就业网</a>
			<a href="http://oa.hebut.edu.cn/index.htm" target="_blank">办公网</a> <a
				href="http://tm.hebut.edu.cn/CivilEngineering/index.jsp"
				target="_blank">土木工程学院</a> <a href="http://219.243.86.235/"
				target="_blank">控制学院</a> <a href="http://clxy.hebut.edu.cn/"
				target="_blank">材料学院</a> <a href="http://www.scse.hebut.edu.cn/"
				target="_blank">计算机学院</a> <a href="http://jyxy.hebut.edu.cn/"
				target="_blank">建艺学院</a> <a href="http://115.24.160.162/"
				target="_blank">教务系统</a>
		</p>
		<p class="footer3">© 2009-2015 Hebut.com 版权所有 ICP证：津B2-20080101</p>
	</div>
<script>
	function validate(){
		var x = document.getElementById("useName").value;
		var y1 = document.getElementById("passwordOne").value;
		var y2 = document.getElementById("passwordTwo").value;
		var z = document.getElementById("name").value;
		var c = document.getElementById("y");
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
		if(y1 == null || y1 == "" || y2 == null || y2 == ""){
			s += "密码不能为空！\n";
			document.getElementById("passwordOne").focus();
			bool = false;
		}else if(y1.length > 10 || y2.length > 10){
			s += "密码长度错误！\n";
			document.getElementById("passwordOne").focus();
			bool = false;
			}else if(y1 != y2){
				s += "确认密码不一致！\n";
				bool = false;		
				}
		if(z == null || z == ""){
			s += "昵称不能为空！\n";
			document.getElementById("name").focus();
			bool = false;
		}else if(z.length > 6){
			s += "昵称长度错误！\n";
			document.getElementById("name").focus();
			bool = false;
			}
		if(!c.checked){
			s += "请勾选《云数据操纵助手章程》\n";
			bool = false;
			}
		if(bool)
			document.getElementById("giraffe_form").submit();
		else
			alert(s);
		}
</script>

</body>
</html>
