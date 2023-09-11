<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>login.jsp</title>
    <meta charset="UTF-8" />
</head>

<body>
	<!--  로그인한 사용자인지 아닌지 판별하고 = userId가 존재하냐 안하냐
		로그한 사용자 아이디가 있다면 login.jsp에 접근하지 못하고
		selProduct.jsp로 이동하게해야함
	 -->
    <h1>로그인</h1>
    <hr />
    
    <form method="POST">
	<fieldset>
    	<legend>로그인</legend>
	    <label for="id">아이디</label>
	    <input type="text" name="id" id="id" />
	    <label for="passwd">패스워드</label>
	    <input type="password" name="passwd" id="passwd" />
	    <input type="hidden" name="command" value="login" />
	    <input type="submit" value="로그인"/>
    </fieldset>
    </form>
    
</body>
</html>