<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib uri="/51java" prefix="51java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>51JAVACMS－国内优秀的JAVA(JSP)网站管理系统|开源 中文java cms jsp ajax - powered by 51javacms</title>
<meta content="51JAVACMS,国内开源网站内容管理系统,中文 java cms jsp ajax 51javacms" name="keywords" />
<meta content="提供国内开源java cms jsp ajax系统下载,中文网站建设,java虚拟主机等服务" name="description" />
<link rel="shortcut icon" href="<51java:webroot/>/images/logo.ico"/>
<link rel="stylesheet" rev="stylesheet" href="<51java:webroot/>/css/article.css" type="text/css" media="all" />
<script type="text/javascript" src="<51java:webroot/>/js/51javacms.js" ></script>
</head>
<body>
<div id="head"><%@ include file="head.jsp"%></div>
<!-- 主体开始 -->
<div id="main">
    <div class="left"><!-- 左侧导航开始 --><%@ include file="left.jsp"%><!-- 左侧导航结束 --></div>
    <div class="right">
	<!-- 内容区域开始 -->
				<div class="column">
						<div class="title">
								<div class="search">
	<form action="http://${header["host"]}${pageContext.request.contextPath}/PluginCtrl?page=SearchPage" method="post">
									关键字
									<input name="search_txt" type="text" class="txtSearch" />
									<input type="submit" value="搜索" class="btnSubmit" />
								</form>
								</div>
当前位置：<51java:foreach var="col" items="${parentcols}">
<51java:choose>
<51java:when test="${currentcnt==cnt}"><a href="${col.link}" target="_blank"><span class="current">${col.name}</span></a></51java:when>
<51java:otherwise><a href="${col.link}" target="_blank">${col.name}</a> > </51java:otherwise>
</51java:choose></51java:foreach></div>
						<div class="b">
							<div class="h2">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
								  <tr>
									<td align="center"><b>标题</b></td>
									<td width="400"> </td>
									<td align="center"><b>日期</b></td>
								  </tr>
								</table>
							</div>
<div class="bin">
    <ul class="list"><51java:arlist>
        <li <51java:if test="${article.top}">class="up"</51java:if>><span class="date">
<51java:formatdate format="yyyy-MM-dd" datetime="${article.creatime}" /></span>
<a href="${article.url}" target="_blank">${article.title}</a>
<51java:if test="${article.top}"><img src="<51java:webroot/>/images/up.gif" /></51java:if>
</li>
</51java:arlist>
</ul>
<51java:if test="${totalpage>1}"><div><%@ include file="../system/page/page2.jsp"%></div></51java:if>
							</div>
				</div>
				<!-- 内容区域结束 -->
			</div>
              </div>
	</div>
	<!-- 主体结束 -->
<%@ include file="foot.jsp"%>
</body>
</html>