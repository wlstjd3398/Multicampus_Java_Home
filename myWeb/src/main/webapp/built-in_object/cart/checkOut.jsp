<%@ page contentType="text/html; charset=UTF-8" import="java.util.*" %>

<%
	String products = "";	

	@SuppressWarnings("unchecked")
	ArrayList<String> cart = (ArrayList<String>)session.getAttribute("cart");
	
	if(cart == null){
		products = "선택한 상품이 존재하지 않습니다";
	}else{
		for(String product : cart){
			products +="<h4>" + product + "</h4>";
		}
		
		cart.clear();
	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 확인</title>
</head>
<body>

	<h2>장바구니 확인</h2>
	<hr />
	
	
	<%= products %>
	<br /><br />
	<a href="selProduct.jsp">상품 구매 페이지로 이동</a>

</body>
</html>