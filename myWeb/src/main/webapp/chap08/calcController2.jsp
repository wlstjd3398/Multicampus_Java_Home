<%@ page contentType="text/html; charset=UTF-8" import="chap08.*" %>

<%
	String viewPath = "/WEB-INF/views/chap08/";
	int result = 0;	

	if(request.getMethod().equals("POST")){
		CalcBean bean = new CalcBean();
		bean.setNum1(Integer.parseInt(request.getParameter("num1")));
		bean.setOperation(request.getParameter("operation"));
		bean.setNum2(Integer.parseInt(request.getParameter("num2")));
		
		result = bean.calculate();
	}
	
	request.setAttribute("result", result);
	pageContext.forward(viewPath + "calc.jsp");
	
%>