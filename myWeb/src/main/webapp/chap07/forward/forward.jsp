<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward.jsp</title>
</head>
<body>

	<h2>forward example</h2>
	<hr />
	
	<h4>여기 까지의 내용이 브라우저에 보일까요?</h4>

	<jsp:forward page="main.jsp">
		<jsp:param value="seong@daum.net" name="email"/>
		<jsp:param value="02-1234-5678" name="tel"/>
	</jsp:forward>

</body>
</html>