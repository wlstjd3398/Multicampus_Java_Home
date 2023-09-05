<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>config.jsp</title>
</head>
<body>

	<h2>config 내장 객체</h2>
	<hr />

	<h4>adminID: <%= config.getInitParameter("username") %></h4>
	<h4>gender: <%= config.getInitParameter("gender") %></h4>
	
</body>
</html>