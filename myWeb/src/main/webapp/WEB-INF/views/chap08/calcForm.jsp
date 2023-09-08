<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcForm.jsp</title>
</head>
<body>
	<h2>계산기 jsp</h2>
	<hr />
	<form method="POST">
	<fieldset>
		<legend>간단 계산기</legend>
	<input type="number" name="num1" value="0">
	<select name="operation">
		<option selected>+</option>
		<option>-</option>
		<option>*</option>
		<option>/</option>
	</select>
	
	<input type="number" name="num2" value="0">
	<input type="submit" value="계산">
	<input type="reset" value="초기화">
	</fieldset>
	</form>
	
</body>
</html>