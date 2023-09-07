<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach.jsp</title>
</head>
<body>

	<h2>JSTL c:forEach</h2>
	<hr />
	
	<c:forEach items="${members}" var="member" begin="5" end="9" varStatus="status">
		index: ${status.index } / ${status.count }<br />
		name: ${member.name } <br />
		email: ${member.email } <br />
		<hr />
	</c:forEach>
	
</body>
</html>