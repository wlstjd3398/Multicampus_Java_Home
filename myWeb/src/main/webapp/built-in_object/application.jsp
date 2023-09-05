<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application.jsp</title>
</head>
<body>

	<h2>application 내장 객체</h2>
	<hr />

	<h4>서버 정보: <%= application.getServerInfo() %></h4>
	<h4>Servlet API Version: <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %></h4>
	<h4>JSP 실제 경로: <%= application.getRealPath("application.jsp") %></h4>
	<h4>adminID: <%= application.getInitParameter("adminID") %></h4>
	<h4>adminPasswd: <%= application.getInitParameter("adminPasswd") %></h4>
	
</body>
</html>