<%@ page contentType="text/html; charset=UTF-8" import="java.util.*" %>

<%
	if(session.getAttribute("userId") == null){
		response.sendRedirect("login.jsp");
		
	}else{
		String products = "";	
	
		@SuppressWarnings("unchecked")
		ArrayList<String> cart = (ArrayList<String>)session.getAttribute("cart");
		String command =request.getParameter("command");
		
		if(command != null && command.equals("cartClear")){
			if(!cart.isEmpty()){
				cart.clear();
			}
		}else if(command != null && command.equals("logout")){
			session.invalidate();
			response.sendRedirect("login.jsp");
		}
		
		/*
		if(request.getMethod().equals("POST")){
			String command = request.getParameter("command");
			
			if(command.equals("cartClear")){
				if(!cart.isEmpty()){
					cart.clear();
				}
			}else if(command.equals("logout")){
				session.invalidate();
				response.sendRedirect("login.jsp");
			}
		}
		*/
		
		if(cart != null && !cart.isEmpty()){
			for(String product : cart){
				products +="<h4>" + product + "</h4>";
			}
		}else{
			products = "선택한 상품이 존재하지 않습니다";
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

	<a href="checkOut.jsp?command=cartClear">장바구니 비우기</a>
	<a href="checkOut.jsp?command=logout">로그아웃</a>

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
<%
	}
%>