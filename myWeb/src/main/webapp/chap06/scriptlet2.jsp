<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet2.jsp</title>
</head>
<body>

	<h2>scriptlet example2</h2>
	<hr />
<%
	for(int i=0; i<10; i++){
%>
		<h4><%= i + "<br />" %>hello, World!</h4>
<%
	}
%>

</body>
</html>