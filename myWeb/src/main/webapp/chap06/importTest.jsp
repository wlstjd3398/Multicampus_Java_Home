<%@ page contentType="text/html; charset=UTF-8" 
	import="java.time.*, java.util.*"
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>

<body>

	<h2>Hello, World ... !</h2>
	<hr />

	<h4>현재 날짜와 시간: <%= java.time.LocalDateTime.now() %></h4>

</body>
</html>