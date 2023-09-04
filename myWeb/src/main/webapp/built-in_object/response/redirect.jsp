<%@ page contentType="text/html; charset=UTF-8" %>

<%
	// redirect.jsp
	String url = "pageControlEnd.jsp";
	String username = request.getParameter("username");
	String email = "seong@gmail.com";
	
	url += "?username=" + username + "&email=" + email;
	
	response.sendRedirect(url);
%>