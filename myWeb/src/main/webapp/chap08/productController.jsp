<%@ page contentType="text/html; charset=UTF-8" import="chap08.*" %>

<%
	ProductService service = new ProductService();
	
	String action = request.getParameter("action");
	String viewPath = "/WEB-INF/views/chap08/";
	
	if(action == null || action.equals("list")){
		request.setAttribute("products", service.findAll());
		pageContext.forward(viewPath + "productList.jsp");
	}else if(action.equals("info")){
		String id = request.getParameter("id");
		request.setAttribute("product", service.find(id));
		pageContext.forward(viewPath + "productInfo.jsp");
	}
%>