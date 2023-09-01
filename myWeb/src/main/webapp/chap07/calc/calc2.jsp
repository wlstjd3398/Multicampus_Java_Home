<%@ page contentType="text/html; charset=UTF-8" 
	import="chap07.CalcBean"
%>

<jsp:useBean id="bean" class="chap07.CalcBean" />
	<%-- 
	<jsp:setProperty name="bean" property="num1" />
	<jsp:setProperty name="bean" property="operation" />
	<jsp:setProperty name="bean" property="num2" />
	--%>
	<jsp:setProperty name="bean" property="*" />
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc.jsp</title>
</head>
<body>
	<h2>계산기 jsp</h2>
	<hr />
	<form method="post">
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
	
	<hr />
	<h4>계산 결과: <%=bean.calculate() %></h4>
</body>
</html>