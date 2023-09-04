<%@ page contentType="text/html; charset=UTF-8" %>
<%
	if(request.getMethod().equals("POST")) {
		request.setCharacterEncoding("utf-8");
	}

	String username = request.getParameter("username");
	String email = request.getParameter("email");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageControlEnd.jsp</title>
</head>
<body>

	<h2>forward &amp; redirect 결과</h2>
	<h4>username: <%= username %></h4>
	<h4>email: <%= email %></h4>

</body>
</html>