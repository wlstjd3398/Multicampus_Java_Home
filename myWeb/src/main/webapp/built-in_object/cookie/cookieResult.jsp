<%@ page contentType="text/html; charset=UTF-8" %>
<%
	Cookie[] cookies = request.getCookies();
	String productCookie = "";
	
	
	for(Cookie cookie : cookies){
			if(cookie.getName().equals("product")){
				productCookie += cookie.getName() + " / " + cookie.getValue();
			}
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookieResult.jsp</title>
</head>
<body>

	<h2>쿠키 확인</h2>
	<hr />
	
	<h4>cookie: <%=productCookie %></h4>

</body>
</html>