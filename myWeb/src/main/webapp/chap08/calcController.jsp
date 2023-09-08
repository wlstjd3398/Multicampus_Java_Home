<%@ page contentType="text/html; charset=UTF-8" import="chap08.*" %>

<%
	String viewPath = "/WEB-INF/views/chap08/";
	
	if(request.getMethod().equals("GET")){
		pageContext.forward(viewPath + "calcForm.jsp");
	}else if(request.getMethod().equals("POST")){
		CalcBean bean = new CalcBean();
		bean.setNum1(Integer.parseInt(request.getParameter("num1")));
		bean.setOperation(request.getParameter("operation"));
		bean.setNum2(Integer.parseInt(request.getParameter("num2")));
		
		request.setAttribute("result", bean.calculate());
		
		pageContext.forward(viewPath + "calcResult.jsp");
	}
	
%>