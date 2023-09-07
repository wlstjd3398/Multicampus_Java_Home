<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forTokens.jsp</title>
</head>
<body>

	<h2>JSTL c:forTokens</h2>
	<hr/>
	
	<c:forTokens items="손흥민, 010-1234-5678, 춘천, 축구선수" delims="," var="token">
		${token }<br/>
	</c:forTokens>
	
</body>
</html>