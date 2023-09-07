<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url.jsp</title>
</head>
<body>

	<h2>JSTL c:url</h2>
	<hr />
	
	<c:url value="/chap07/jstl/choose.jsp" var="target">
		<c:param name="sel" value="c" />
	</c:url>
	
	<h4>url: ${target }</h4>
	<a href="${target }">choose.jsp 페이지로 이동</a>
	
</body>
</html>