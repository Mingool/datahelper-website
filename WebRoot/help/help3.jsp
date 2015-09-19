<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>帮助与支持</title>
<link href="../css/help.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="navBig">
		<div id="navSmall">
			<a href="../index.jsp"><img src="../images/logo-1.jpg"
				width="112" height="93" border="0" />
			</a>
			<ul>
				<a class="index" href="../index.jsp"><li></li>
				</a>
				<li><a class="help" href="help1.jsp"></a>
				</li>
				<li><a class="true" href="../event/even1.jsp"></a>
				</li>
				<li><a class="download" href="../download.jsp"></a>
				</li>
				<li><a class="people"
					href="tencent://Message/?Uin=2862460298&websiteName=q-zone.qq.com&Menu=yes"></a>
				</li>
				<li><a class="about" href="../about/about1.jsp"></a>
				</li>
			</ul>
		</div>
	</div>
	<div id="contentBox">
		<div id="contentSmall">
			<div class="list">
				<h2>开发者资源</h2>
				<ul>
					<li class="title">QuickStart</li>
					<li class="liContent"><a href="help1.jsp">搭建环境</a>
					</li>
					<li class="liContent"><a href="help2.jsp">Demo</a>
					</li>
				</ul>
				<ul>
					<li class="title">API</li>
					<li class="liContent" id="having"><a href="help3.jsp">FexUtils</a>
					</li>
					<li class="liContent"><a href="help4.jsp">支持jar包</a>
					</li>
				</ul>
			</div>
			<div class="content">
				<h3>Docs</h3>
				<div class="contentP">
					<p>欢迎查看FexUtils开发者文档</p>
					<p>请点击下面链接下载SDK开发者文档</p>
					<p>下载后，解压即可查看。</p>
					<p>
						<a href="${pageContext.request.contextPath }/download_api.action"  style="color:#06F;">立即下载</a>
					</p>
					<p>
						<img src="../images/help-6.png" width="358" height="158" />
					</p>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<p class="footer1">
			<a href="../about/about1.jsp" target="_blank">关于我们</a> <a
				href="../about/about2.jsp" target="_blank">法律声明</a> <a
				href="../about/about3.jsp" target="_blank">友情链接</a>
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
</body>
</html>
