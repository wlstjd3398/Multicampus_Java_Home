<%@ page contentType="text/html; charset=UTF-8" %>

<%-- jsp 주석입니다 !브라우저소스코드에서 안보임--%>

<!-- html 주석입니다 브라우저소스코드에서 보임-->

<%
	// 자바 한 줄 주석입니다 !브라우저소스코드에서 안보임
	/*
		자바 여러 줄 주석입니다 !브라우저소스코드에서 안보임
	*/
	int result = 10;
%>

<!DOCTYPE html>
<html>
<head>
<script>
	// 자바스크립트 한 줄 주석입니다 브라우저소스코드에서 보임
	/*
		자바스크립트 여러 줄 주석입니다 브라우저소스코드에서 보임
	*/
	alert('알림 창을 열었습니다.');
</script>
<style>
/*
	css 주석입니다 브라우저소스코드에서 보임
*/
#target{
border: 2px solid gray;
padding: 20px;
text-align: center;
width: 400px;
}

</style>
<meta charset="UTF-8">
<title>comment.jsp</title>
</head>
<body>

	<h2>jsp 주석 예제</h2>
	<hr />
	
	<div id="target">
		<h4>계산 결과: <%= result %></h4>
	</div>
	
	
</body>
</html>