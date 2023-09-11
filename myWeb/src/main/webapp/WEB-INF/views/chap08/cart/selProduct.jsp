<%@ page contentType="text/html; charset=UTF-8" import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>selProduct.jsp</title>
	<script>
		${script}
	</script>
</head>
<body>

	<h2>상품 구매</h2>
	<hr />
	
	<h4>${loginId}님의 방문을 환영합니다</h4>
	
	<form method="POST">
	<fieldset>
		<legend>상품 선택</legend>
		<select name="product">
			<option selected>사과</option>
			<option>딸기</option>
			<option>배</option>
			<option>포도</option>
			<option>복숭아</option>
			<option>수박</option>
		</select>
	    <input type="hidden" name="command" value="addCart" />
		<input type="submit" value="추가" />
	</fieldset>
	</form>
	
	<br />
    <a href="./cartController.jsp?command=checkOut">장바구니 확인</a>

</body>
</html>