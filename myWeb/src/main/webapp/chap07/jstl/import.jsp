<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>import.jsp</title>
</head>
<body>

	<h2>JSTL c:import</h2>
	<hr />
	
	<h4>다음은 set.jsp 페이지를 import 한 결과입니다 현재방법과 주석방법 두가지</h4>
	<hr />
	
	<c:import url="./set.jsp" var="result" />
	${result }
	<%-- <c:out value="${result }" escapeXml="false" />--%>
	
</body>
</html>