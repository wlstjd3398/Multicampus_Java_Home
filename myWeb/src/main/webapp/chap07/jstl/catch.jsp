<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>catch.jsp</title>
</head>
<body>

	<h2>JSTL c:catch</h2>
	<hr />

	<%--<%= 10 / 0 %>--%>

	<%-- ${ 10 / 0 }--%>

	<c:catch var="errMsg">
		<%=10 / 5%><br />
	</c:catch>
	error Message: ${errMsg }

	<c:catch var="errMsg">
		<%=10 / 0%>
	</c:catch>
	error Message: ${errMsg }



</body>
</html>