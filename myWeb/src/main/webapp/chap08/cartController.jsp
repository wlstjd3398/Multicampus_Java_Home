<%@ page contentType="text/html; charset=UTF-8" %>

<jsp:useBean id="cartBean" class="chap08.CartBean" scope="session" />

<%
	if(request.getMethod().equals("POST")){
		request.setCharacterEncoding("UTF-8");
	}

	// 로그인 보여주기
	String viewPath = "/WEB-INF/views/chap08/cart/";
	String command = request.getParameter("command");

	if(session.getAttribute("loginId") == null){
		if(request.getMethod().equals("GET")){
			pageContext.forward(viewPath + "login.jsp");
			
		}else if(request.getMethod().equals("POST") && command != null && command.equals("login")){
			
			if(cartBean.checkLogin(request.getParameter("id"), request.getParameter("passwd"))){
				session.setAttribute("loginId", request.getParameter("id"));
				pageContext.forward(viewPath + "selProduct.jsp");
				
			}else{
				response.sendRedirect("cartController.jsp");
				// pageContext.forward(viewPath + "login.jsp");
			}
		}
	}else if(command != null && command.equals("addCart")){
		String product = request.getParameter("product");
		String script = "alert('" + product + " 상품을 장바구니에 추가했습니다');";
		
		cartBean.addCart(product);
		request.setAttribute("script", script);
		pageContext.forward(viewPath + "selProduct.jsp");
		
	}else if(command != null && command.equals("checkOut")) {
		request.setAttribute("cart", cartBean.getCart());
		pageContext.forward(viewPath + "checkOut.jsp");
		
	}else if(command != null && command.equals("clearCart")) {
		cartBean.clearCart();
		pageContext.forward(viewPath + "checkOut.jsp");
		
	}else if(command != null && command.equals("logout")) {
		session.invalidate();
		response.sendRedirect("cartController.jsp");
		
	}else {
		pageContext.forward(viewPath + "selProduct.jsp");
	}
	
%>