<%@ page contentType="text/html; charset=UTF-8" %>

<%
	String msg = "";
	if(session.getAttribute("msg") != null){
		msg = (String)session.getAttribute("msg");
	}
%>

<!DOCTYPE html>
<html>
<head>
    <title>login.jsp</title>
    <meta charset="UTF-8" />
</head>

<body>
    <h1>로그인</h1>
    <hr />
    
    <form method="POST" action="loginProc.jsp">
	<fieldset>
    	<legend>로그인</legend>
	    <label for="id">아이디</label>
	    <input type="text" name="id" id="id" />
	    <label for="passwd">패스워드</label>
	    <input type="password" name="passwd" id="passwd" />
	    <input type="submit" value="로그인"/>
    </fieldset>
    </form>
    
    <h4><%= msg %></h4>
</body>
</html>