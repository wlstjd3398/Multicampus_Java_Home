<%@ page contentType="text/html; charset=UTF-8" %>

<%
	String script = "";
	if(session.isNew()){
		script += "alert('세션 객체가 처음 생성 되었습니다');";
		session.setAttribute("username", "손흥민");
	}
	else{
		session.invalidate();
		script = "alert('세션 객체가 제거 되었습니다');";
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session.jsp</title>
<script>
<%= script %> 
</script>
</head>
<body>

	<h2>session example</h2>
	<hr />
	
	<h4>username:  <%=session.getAttribute("username") %> </h4>
	<h4>세션 유휴 시간:  <%=session.getMaxInactiveInterval() %> </h4>
	<h4>세션 ID:  <%=session.getId() %> </h4>
	
	<a href="sessionResult.jsp">유저 이름 확인</a>
	
</body>
</html>