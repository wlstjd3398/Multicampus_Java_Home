<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set.jsp</title>
</head>
<body>

	<h2>JSTL c:set</h2>
	<hr />
	
	<c:set var="msg" value="Hello, World ... !" />
	<h4>msg: ${msg}</h4>
	<h4>msg: <%= pageContext.getAttribute("msg") %></h4>
	
	<hr/>
	<h4>member name: ${member.name }</h4>
	<h4>member email: ${member.email }</h4>
	
	<hr/>
	<c:set target="${member }" property="email" value="change@gmail.com"/>
	<h4>member name: ${member.name }</h4>
	<h4>member email: ${member.email }</h4>
	
	
</body>
</html>