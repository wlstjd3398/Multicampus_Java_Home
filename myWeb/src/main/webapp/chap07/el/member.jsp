<%@ page contentType="text/html; charset=UTF-8" %>

﻿<jsp:useBean id="m" class="chap07.Member" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member.jsp</title>
</head>
<body>

	<h2>Member Info</h2>
	<hr />
	
	<h4>name: ${sessionScope.m.name }</h4>
	<h4>email: ${m.email }</h4>
	
	<a href="sessionMember.jsp">sessionMember</a>
	
</body>
</html>