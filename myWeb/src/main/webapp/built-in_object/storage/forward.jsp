<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward.jsp</title>
</head>
<body>

	<h2>스토리지 데이터 확인</h2>
	
	<h4>pageContext: <%= pageContext.getAttribute("pageContext") %></h4>
	<h4>request: <%= request.getAttribute("request") %></h4>
	<h4>session: <%= session.getAttribute("session") %></h4>
	<h4>application: <%= application.getAttribute("application") %></h4>
	<hr />
	
	<a href="newPage.jsp">페이지 이동</a>

</body>
</html>
