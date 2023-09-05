<%@ page contentType="text/html; charset=UTF-8" %>
    
<%
	pageContext.setAttribute("pageContext", "pageContext_Data");
	request.setAttribute("request", "request_Data");
	session.setAttribute("session", "session_Data");
	application.setAttribute("application", "application_Data");


%>

<jsp:forward page="forward.jsp" />

<%-- 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>storage.jsp</title>
</head>
<body>

	<h2>스토리지 데이터 확인</h2>
	
	<h4>pageContext: <%= pageContext.getAttribute("pageContext") %></h4>
	<h4>request: <%= request.getAttribute("request") %></h4>
	<h4>session: <%= session.getAttribute("session") %></h4>
	<h4>application: <%= application.getAttribute("application") %></h4>

</body>
</html>
--%>