<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out.jsp</title>
	<style>
	table, td{
		border: 2px solid gray;
		border-collapse: collapse;
	}
	td{
		padding: 10px;
		text-align: center;
	}
	</style>
</head>
<body>

	<h2>JSTL c:out</h2>
	<hr />
	
	<table>
		<c:forEach items="${members}" var="member">
			<tr>
				<td>${member.name }</td>
				<td>
					<c:out value="${member.email }" escapeXml="false">
						email 없음!
					</c:out>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>