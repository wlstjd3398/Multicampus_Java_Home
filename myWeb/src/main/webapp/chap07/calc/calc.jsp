<%@ page contentType="text/html; charset=UTF-8" 
	import="chap07.CalcBean"
%>
<%
	int result = 0;
	
	if(request.getMethod().equals("POST")){
		CalcBean bean = new CalcBean();
		bean.setNum1(Integer.parseInt(request.getParameter("num1")));
		bean.setOperation(request.getParameter("operation"));
		bean.setNum2(Integer.parseInt(request.getParameter("num2")));
	
		result = bean.calculate();
	}
%>
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
	<h4>계산 결과: <%=result %></h4>
</body>
</html>