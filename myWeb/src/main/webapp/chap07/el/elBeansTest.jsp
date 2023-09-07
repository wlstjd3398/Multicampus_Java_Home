<%@ page contentType="text/html; charset=UTF-8" %>

<jsp:useBean id="product" class="chap07.Product" scope="session" />

<%
	String [] productList = product.getProductList();
	String items = "";
	
	for(String prod : productList){
		items += "<option>" + prod + "</option>";
	}
	
	pageContext.setAttribute("items", items);
%>

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
			${items }
		</select>
		<input type="submit" value="전송" />
	</fieldset>
	</form>


</body>
</html>