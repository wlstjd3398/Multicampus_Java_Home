<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>remove.jsp</title>
</head>
<body>

	<h2>JSTL c:remove</h2>
	<hr/>
	
	<c:set var="msg" value="hello!!" />
		msg: ${msg }
	
	<hr />
	<c:remove var="msg" />
		msg: ${msg }

</body>
</html>