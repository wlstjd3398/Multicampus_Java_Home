<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>productList.jsp</title>
	<style>
	table, th, td{
		border: 2px solid gray;
		border-collapse: collapse;
	}
	
	th, td{
		padding: 10px;
		text-align: center;
	}
	</style>
</head>
<body>

	<h2>상품 목록</h2>
	<hr />
	
	<table>
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>가격</th>
		</tr>
		<c:forEach items="${products}" var="product" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td><a href="productController2?action=info&id=${product.id}">${product.name }</a></td>
				<td>${product.price }</td>
			</tr>
		</c:forEach>
	</table>
 
</body>
</html>