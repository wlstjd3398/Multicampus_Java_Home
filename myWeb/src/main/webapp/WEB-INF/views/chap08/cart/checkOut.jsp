<%@ page contentType="text/html; charset=UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 확인</title>
</head>
<body>

	<h2>장바구니 확인</h2>
	<hr />
	
	<ol>
	<c:forEach items = "${cart }" var="product">
		<li>${product }</li>		
	</c:forEach>
	</ol>
	<br /><br />
	<a href="./cartController.jsp">상품 구매 페이지로 이동</a>

	<a href="./cartController.jsp?command=clearCart">장바구니 비우기</a>
	<a href="./cartController.jsp?command=logout">로그아웃</a>

	<!--  <form method="POST">
		<input type="hidden" name="command" value="cartClear" />
		<input type="submit" value="장바구니 비우기" />
	</form><br />
	
	<form method="POST">
		<input type="hidden" name="command" value="logout" />
		<input type="submit" value="로그아웃" />
	</form>
	-->
</body>
</html>