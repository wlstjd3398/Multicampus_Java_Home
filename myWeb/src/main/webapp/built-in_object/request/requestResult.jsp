<%@ page contentType="text/html; charset=UTF-8" 
import="java.util.Enumeration" %>
<%
	if(request.getMethod().equals("POST")){
		request.setCharacterEncoding("utf-8");
	}
	
	String paramNames = "";
	Enumeration<String> enumNames = request.getParameterNames();
	
	while(enumNames.hasMoreElements()){
		paramNames += enumNames.nextElement() + " / ";
	}
	
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String job = request.getParameter("job");
	String[] favorites = request.getParameterValues("favorite");
	
	String paramFavorites = "";
	
	for(String favorite: favorites){
		paramFavorites += favorite + " / ";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestResult.jsp</title>
</head>
<body>

	<h2>파라미터 정보</h2>
	<!--  -->
	<hr />
	
	<h4>파라미터 명: <%=paramNames %></h4>
	<h4>name: <%=name %></h4>
	<h4>gender: <%=gender %></h4>
	<h4>job: <%=job %></h4>
	<h4>favorites: <%=paramFavorites %></h4>

	<h2>클라이언트 정보</h2>
	<h4>client ip: <%=request.getRemoteAddr() %></h4>
	<hr />
	<!-- 클라이언트 정보를 얻을수있다 -->
	<h4>프로토콜 종류: <%=request.getScheme() %></h4>
	<h4>서버이름: <%=request.getServerName() %></h4>
	<h4>서버 포트: <%=request.getServerPort() %></h4>
	
	<h4>지역정보: <%=request.getLocale() %></h4>
	<h4>사용하는 프로토콜: <%=request.getProtocol() %></h4>
	<h4>서버 로컬주소: <%=request.getLocalAddr() %></h4>
	
	
	

</body>
</html>