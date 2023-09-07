<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="product" class="chap07.Product" scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elBeansTest.jsp</title>
</head>
<body>

	<h2>EL Bean Test</h2>
	<hr />
	
	<form method="POST" action="elBeanResult.jsp">
	<fieldset>
		<legend>상품 선택</legend>
		<select name="product">
			<c:forEach items="${product.productList}" var="prod">
				<option>${prod}</option>			
			</c:forEach>
		</select>
		<input type="submit" value="전송" />
	</fieldset>
	</form>
</body>
</html>