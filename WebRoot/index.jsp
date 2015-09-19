<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>云数据操纵助手</title>
<link href="${pageContext.request.contextPath }/css/index.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/lanrenzhijia.css"
	type="text/css" rel="stylesheet" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/lanrenzhijia.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/xuanxiangka.js"></script>
</head>

<body>
	<div id="navBig">
		<div id="navSmall">
			<a href="${pageContext.request.contextPath }/index.jsp"><img
				src="${pageContext.request.contextPath }/images/logo-1.jpg"
				width="112" height="93" border="0" /> </a>
			<ul>
				<li><a class="index"
					href="${pageContext.request.contextPath }/index.jsp"></a>
				</li>
				<li><a class="help"
					href="${pageContext.request.contextPath }/help/help1.jsp"></a>
				</li>
				<li><a class="true"
					href="${pageContext.request.contextPath }/event/even1.jsp"></a>
				</li>
				<li><a class="download"
					href="${pageContext.request.contextPath }/download.jsp"></a>
				</li>
				<li><a class="people"
					href="tencent://Message/?Uin=2862460298&websiteName=q-zone.qq.com&Menu=yes"></a>
				</li>
				<li><a class="about"
					href="${pageContext.request.contextPath }/about/about1.jsp"></a>
				</li>
			</ul>
		</div>
	</div>
	<div id="picture">
		<div id="box_lanrenzhijia">
			<div class="list">
				<ul>
					<li><h2 class="test-1"></h2>
					</li>
					<li><h2 class="test-2"></h2>
					</li>
					<li><h2 class="test-3"></h2>
					</li>
					<li><h2 class="test-4"></h2>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="loginBox">
		<div class="login">
			<form
				action="${pageContext.request.contextPath }/developer/login.action"
				name="login_form" method="post" id="myForm" style="height:100px;">
				<div class="input">
					<input type="text" name="username" maxlength="16" id="useName" />
				</div>
				<div class="input">
					<input class="inputP" type="password" name="password"
						maxlength="12" id="password" /> <input type="checkbox" name=""
						value="" id="y" checked="checked" /> <span>我已经同意了<a
						href="${pageContext.request.contextPath }/about/about2.jsp">《云数据操纵助手章程》</a>
					</span>
				</div>
			</form>
			<div id="return" style="text-align: left: ;">
				<br /> <font style="color: red"><s:property value="#message" />
				</font>
			</div>
			<div>
				<a class="enter" href="javascript:void(0);"
					onclick="javascript:validate();"></a>
			</div>
			<h2>
				<a href="javascript:void(0)">忘了密码？</a><span> | </span><a
					href="${pageContext.request.contextPath }/register.jsp">注册新账号</a><span>
					| </span><a href="javascript:void(0)">意见反馈</a>
			</h2>
		</div>
	</div>
	<div id="warning">
		<ul>
			<li class="warningPicture"><img
				src="${pageContext.request.contextPath }/images/warningPicture.png"
				width="18" height="14" />
			</li>
			<li><a href="${pageContext.request.contextPath }/help/help1.jsp">移动平台开发的终极解决方案</a>
			</li>
			<li><a href="${pageContext.request.contextPath }/help/help1.jsp">隶属于211名校河北工业大学</a>
			</li>
			<li><a href="${pageContext.request.contextPath }/help/help1.jsp">一键调用SDK，开发从此变得简便</a>
			</li>
			<li class="bold">河北工业大学-云数据操纵助手</li>
		</ul>
	</div>
	<div id="advantage">
		<ul>
			<li class="left"></li>
			<li class="content" id="c_1" onmouseover="c_kua()"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">跨平台性</p>
					<p class="advPicture">
						<img src="${pageContext.request.contextPath }/images/adv-3.png"
							width="60" height="60" />
					</p>
					<p class="smallSize">提供Java平台JDK</p> </a></li>
			<li class="content2" id="c-1"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">跨平台性</p>
					<p class="smallSize">
						我们的SDK采用java语言编写<br /> 您可以在任何java环境下使用我们的产品
					</p> </a> <a href="${pageContext.request.contextPath }/help/help1.jsp"
				class="white">立即查看</a></li>
			<li class="content" id="c_2" onmouseover="c_jie()"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">接口统计</p>
					<p class="advPicture">
						<img src="${pageContext.request.contextPath }/images/adv-4.png"
							width="60" height="60" />
					</p>
					<p class="smallSize">用户接口访问统计</p> </a></li>
			<li class="content2" id="c-2"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">接口统计</p>
					<p class="smallSize">
						想了解多少用户访问了您的数据库吗？<br /> 登录云数据操纵助手即可查看
					</p> </a> <a href="${pageContext.request.contextPath }/help/help1.jsp"
				class="white">立即查看</a></li>
			<li class="content" id="c_3" onmouseover="c_fu()"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">负载均衡</p>
					<p class="advPicture">
						<img src="${pageContext.request.contextPath }/images/adv-1.png"
							width="60" height="60" />
					</p>
					<p class="smallSize">DBCP数据源解决高并发</p> </a></li>
			<li class="content2" id="c-3"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">负载均衡</p>
					<p class="smallSize">
						担心用户多，并发问题严重？<br /> 没关系!我们使用了DBCP数据源
					</p> </a> <a href="${pageContext.request.contextPath }/help/help1.jsp"
				class="white">立即查看</a></li>
			<li class="content" id="c_4" onmouseover="c_yun()"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">云数据库</p>
					<p class="advPicture">
						<img src="${pageContext.request.contextPath }/images/adv-2.png"
							width="60" height="60" />
					</p>
					<p class="smallSize">支持MYSQL数据库</p> </a></li>
			<li class="content2" id="c-4"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="bigSize">云数据库</p>
					<p class="smallSize">
						免费的MySQL数据库<br /> 低成本，极便捷
					</p> </a> <a href="${pageContext.request.contextPath }/help/help1.jsp"
				class="white">立即查看</a></li>
			<li class="right"></li>
			<li class="other" id="o_1" onmouseover="o_yun()">

				<p class="otherTitle">
					<img src="${pageContext.request.contextPath }/images/adv-5.png"
						width="18" height="20" />云盾
				</p>
				<p class="p1">接口警报</p>
				<p class="p2">更多模块正在开发中，敬请期待</p> </a></li>
			<li class="other2" id="o-1"><a
				href="${pageContext.request.contextPath }/help/help1.jsp">
					<p class="otherTitle">
						<img src="${pageContext.request.contextPath }/images/adv-8.png"
							width="18" height="20" />云盾
					</p>
					<p class="p1">接口警报</p>
					<p class="p2">更多模块正在开发中，敬请期待</p> </a> <a
				href="${pageContext.request.contextPath }/help/help1.jsp"
				class="white">立即查看</a></li>
		</ul>
	</div>
	<div id="contact">
		<h2>企业用户</h2>
		<p>我们不仅有面向个人网站的免费服务，还有专门为企业量身打造的付费服务。独享DNS服务器集群，100%SLA。</p>
		<p>
			你可以<a href="#">了解更多详情</a>，或立即在线咨询
		</p>
		<span><img
			src="${pageContext.request.contextPath }/images/contact-1.png"
			width="19" height="19" />18002137253</span> <span><img
			src="${pageContext.request.contextPath }/images/contact-2.png"
			width="19" height="20" />2862460298</span>
	</div>
	<div id="footer">
		<p class="footer1">
			<a href="${pageContext.request.contextPath }/about/about1.jsp"
				target="_blank">关于我们</a> <a
				href="${pageContext.request.contextPath }/about/about2.jsp"
				target="_blank">法律声明</a> <a
				href="${pageContext.request.contextPath }/about/about3.jsp"
				target="_blank">友情链接</a>
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
		function validate() {
			var x = document.getElementById("useName").value;
			var y = document.getElementById("password").value;
			var c = document.getElementById("y");
			var s = "";
			var bool = true;
			if (x == null || x == "") {
				s += "账号不能为空！\n";
				document.getElementById("useName").focus();
				bool = false;
			} else if (x.length > 10) {
				s += "账号长度错误！\n";
				document.getElementById("useName").focus();
				bool = false;
			}
			if (y == null || y == "") {
				s += "密码不能为空！\n";
				document.getElementById("password").focus();
				bool = false;
			} else if (y.length > 10) {
				s += "密码长度错误！\n";
				document.getElementById("password").focus();
				bool = false;
			}
			if (!c.checked) {
				s += "请勾选《云数据操纵助手章程》\n";
				bool = false;
			}
			if (bool)
				document.getElementById("myForm").submit();
			else
				alert(s);
		}
	</script>
</body>
</html>
