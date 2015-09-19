<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>下载JDK</title>
<link href="css/download.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="navBig">
		<div id="navSmall">
			<a href="index.jsp"><img src="images/logo-1.jpg" width="112"
				height="93" />
			</a>
			<ul>
				<a class="index" href="index.jsp"><li></li>
				</a>
				<li><a class="help" href="help/help1.jsp"></a>
				</li>
				<li><a class="true" href="event/even1.jsp"></a>
				</li>
				<li><a class="download" href="download.jsp"></a>
				</li>
				<li><a class="people"
					href="tencent://Message/?Uin=2862460298&websiteName=q-zone.qq.com&Menu=yes"></a>
				</li>
				<li><a class="about" href="about/about1.jsp"></a>
				</li>
			</ul>
		</div>
	</div>
	<div id="picture"></div>
	<div id="download">
		<a class="enter" href="${pageContext.request.contextPath }/download_sdk.action"></a>
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
</body>
</html>
