<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>includeAction3.jsp</title>
</head>
<body>

	<h2>include 액션 예제3</h2>
	<hr />
	<jsp:include page="content3.jsp">
		<jsp:param value="5" name="num1"/>
		<jsp:param value="3" name="num2"/>
	</jsp:include>
</body>
</html>