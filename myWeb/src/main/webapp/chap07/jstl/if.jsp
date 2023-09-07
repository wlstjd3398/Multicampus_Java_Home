<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>if.jsp</title>
</head>
<body>

	<h2>JSTL c:if</h2>
	<hr />
	
	<c:set var="msg" value="user1" />
	<h4>msg: ${msg}</h4>
	<hr />
	
	<c:if test="${msg == 'user1'}" var="result" />
	<h4>result: ${result }</h4>
	<hr />
	
	<c:if test="${msg == 'user1'}" var="result" >
		<h4>test result: ${result }</h4>
	</c:if>

	
</body>
</html>