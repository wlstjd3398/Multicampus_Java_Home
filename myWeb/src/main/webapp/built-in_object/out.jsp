<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out.jsp</title>
</head>
<body>

	<h2>out 내장 객체</h2>
	<hr />
	
	<h4>버퍼 사이즈: <%=out.getBufferSize() %></h4>
	<h4>여유 버퍼 용량: <%=out.getRemaining() %></h4>
	
<%
	out.flush();
%>

	<h4>flush 후 여유 버퍼 용량: <%=out.getRemaining() %></h4>
	
<%
	out.clear();
%>

	<h4>flush 후 여유 버퍼 용량: <%=out.getRemaining() %></h4>

<%
	out.close();
%>

</body>
</html>