<%@ page contentType="text/html; charset=UTF-8" %>

<%
	Cookie cookie = new Cookie("elCookie", "EL_Test_Cookie");
	response.addCookie(cookie);

	pageContext.setAttribute("pageScopeElTest", "pageContext storage value!");
	request.setAttribute("requestScopeElTest", "request storage value!");
	session.setAttribute("sessionScopeElTest", "session storage value!");
	application.setAttribute("applicationScopeElTest", "application storage value!");
	
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elTest.jsp</title>
</head>
<body>

	<h2>EL Test</h2>
	<hr />
	
	<form method="GET" action="elTestResult.jsp">
		<fieldset>
			<legend>EL Test</legend>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" /><br />
			
			[관심분야]
			<label for="favorite1">정치</label>
			<input type="checkbox" name="favorite" id="favorite1" value="정치" />
			<label for="favorite2">경제</label>
			<input type="checkbox" name="favorite" id="favorite2" value="경제" />
			<label for="favorite3">사회</label>
			<input type="checkbox" name="favorite" id="favorite3" value="사회" />
			<label for="favorite4">문화</label>
			<input type="checkbox" name="favorite" id="favorite4" value="문화" />
		</fieldset><br />
		
		<input type="submit" value="제출" />
	</form>

</body>
</html>