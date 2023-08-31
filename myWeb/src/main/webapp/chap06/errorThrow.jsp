<%@ page contentType="text/html; charset=UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorThrow.jsp</title>
</head>
<body>

	<h2>현재 jsp 문서에서 예외 발생</h2>
	<hr />
	
<%
	int num = 10 / 0;

/*
	try{
		int num = 10 / 0;
	}catch(Exception e){
		out.println("예외 발생!<br />");
		out.println("빠른 시간안에 문제를 해결하겠습니다.");
	}
*/
%>


</body>
</html>