<%@ page contentType="text/html; charset=UTF-8" %>

<%
	// String myName = "longlee";
	pageContext.setAttribute("myName", "longlee");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTestResult.jsp</title>
</head>
<body>

	<h2>EL Test Result</h2>
	<hr />
	
	<%-- 
	<h4>pageScopeElTest: ${pageScope.pageScopeElTest}</h4>
	<h4>requestScopeElTest: ${requestScope.requestScopeElTest}</h4>
	<h4>sessionScopeElTest: ${sessionScope.sessionScopeElTest}</h4>
	<h4>applicationScopeElTest: ${applicationScope.applicationScopeElTest}</h4>
	<br />
	--%>
	<h4>pageScopeElTest: ${pageScopeElTest}</h4>
	<h4>requestScopeElTest: ${requestScopeElTest}</h4>
	<h4>sessionScopeElTest: ${sessionScopeElTest}</h4>
	<h4>applicationScopeElTest: ${applicationScopeElTest}</h4>
	<br />
	<h4>name :${param.name}</h4>
	<h4>favorite1: ${paramValues.favorite[0] }</h4>
	<h4>favorite2: ${paramValues.favorite[1] }</h4>
	<br/>
	<h4>${cookie.elCookie.name} : ${cookie.elCookie.value }</h4>
	<h4>myName: ${myName}</h4>
	
	<%-- 
	<h4>pageScopeElTest: <%= pageContext.getAttribute("pageScopeElTest") %></h4>
	<h4>requestScopeElTest: <%= request.getAttribute("requestScopeElTest") %></h4>
	<h4>sessionScopeElTest: <%= session.getAttribute("sessionScopeElTest") %></h4>
	<h4>applicationScopeElTest: <%= application.getAttribute("applicationScopeElTest") %></h4>
	<br />
	<h4>name: <%= request.getParameter("name") %></h4>
	<h4>favorite1: <%= request.getParameterValues("favorite")[0] %></h4>
	<h4>favorite2: <%= request.getParameterValues("favorite")[1] %></h4>
	--%>
</body>
</html>