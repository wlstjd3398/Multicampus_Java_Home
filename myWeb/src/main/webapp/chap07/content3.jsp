<%@ page contentType="text/html; charset=UTF-8" %>

<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	int result = num1 * num2;
%>

<%= result %>
