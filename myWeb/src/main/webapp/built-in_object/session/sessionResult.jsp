<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionResult.jsp</title>
</head>
<body>

	<h2>유저 이름 확인</h2>
	<hr />
	
	<h4>username:  <%=session.getAttribute("username") %> </h4>
	
	
</body>
</html>