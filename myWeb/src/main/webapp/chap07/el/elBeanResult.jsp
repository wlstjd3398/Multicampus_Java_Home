<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elBeanResult.jsp</title>
</head>
<body>

	<h2>EL Bean Result</h2>
	<hr />
	
	<h4>product: ${param.product }</h4>
	<h4>num1: ${product.num1}</h4>
	<h4>num2: ${product.num2}</h4>
	<h4>productList1: ${product.productList[0]}</h4>
	<h4>productList5: ${product.productList[4]}</h4>
	
</body>
</html>