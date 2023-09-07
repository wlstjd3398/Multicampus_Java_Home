<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect.jsp</title>
</head>
<body>

	<h2>JSTL c:redirect</h2>
	<hr />
	
	<%-- "./jsp" 사용해도 되지만 상대경로로 적는것이 좋다 --%>
	<c:redirect url="./choose.jsp">
		<c:param name="sel" value="d" />
	</c:redirect>
	
</body>
</html>