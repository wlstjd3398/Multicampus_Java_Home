<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet3.jsp</title>
	<style>
	table, td {
		border: 2px solid gray;
		border-collapse: collapse;
	}
	td{
		padding: 5px;
		text-align: center;
	}
	</style>
</head>
<body>

	<h2>scriptlet example3</h2>
	<hr />
	
	<table>
<%
	for(int i=0; i<10; i++){
%>
		<tr><td><%= "Data " + i %></td></tr>
<%
	}
%>

	</table>
	
</body>
</html>