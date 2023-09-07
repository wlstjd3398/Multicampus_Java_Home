<%@ page contentType="text/html; charset=UTF-8" import="java.util.*" %>

<%
	if(session.getAttribute("userId") == null){
		response.sendRedirect("login.jsp");
		
	}else{
		
		String script = "";
		String product = "";
		
		if(request.getMethod().equals("POST")){
			request.setCharacterEncoding("utf-8");
			// 무조건 파라미터를 읽기전에 실행해야 올바르게 인코딩방식을 지정함
			product = request.getParameter("product");
			
			if(session.getAttribute("cart") == null){
				session.setAttribute("cart", new ArrayList<String>());
			}
			
			@SuppressWarnings("unchecked")
			ArrayList<String> cart = (ArrayList<String>)session.getAttribute("cart");
			cart.add(product);
			
			script = "alert('" + product + "상품을 장바구니에 추가했습니다');";
		}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selProduct.jsp</title>
	<script>
		<%= script %>
	</script>
</head>
<body>

	<h2>상품 구매</h2>
	<hr />
	
	<h4><%=session.getAttribute("userId") %>님의 방문을 환영합니다</h4>
	
	<form method="POST">
	<fieldset>
		<legend>상품 선택</legend>
		<select name="product">
			<option selected>사과</option>
			<option>딸기</option>
			<option>배</option>
			<option>포도</option>
			<option>복숭아</option>
			<option>수박</option>
		</select>
		<input type="submit" value="추가" />
	</fieldset>
	</form>
	
	<br />
    <a href="checkOut.jsp">장바구니 확인</a>

</body>
</html>
<%
	}
%>