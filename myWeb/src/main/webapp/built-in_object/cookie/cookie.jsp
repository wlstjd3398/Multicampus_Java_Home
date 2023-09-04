<%@ page contentType="text/html; charset=UTF-8" %>

<%
	Cookie cookie = new Cookie("product", "p1234");
	response.addCookie(cookie);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie.jsp</title>
</head>
<body>

	<h2>Cookie Example</h2>
	<hr />
	
	<h4>개발자 도구에서 현재 서버의 쿠키를 확인해보세요</h4>
	
	<a href="cookieResult.jsp">쿠키 확인</a>
	
	
</body>
</html>