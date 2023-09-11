<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcResult.jsp</title>
</head>
<body>

	<h2>계산 결과</h2>
	<hr />
	
	<h4>result: ${requestScope.result }</h4>

	<!-- 계산 폼으로 이동하는 링크를 생성하세요 -->
	<a href="/myWeb/chap08/calcController">계산하기</a>
</body>
</html>