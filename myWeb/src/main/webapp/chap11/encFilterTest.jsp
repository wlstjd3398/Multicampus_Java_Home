<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>encFilterTest.jsp</title>
</head>
<body>

	<h2>EncFilter 테스트</h2>
	<hr />
	
	<form method="POST">
		<label for="korParam">한글 입력: </label>
		<input type="text" name="korParam" />
		
		<input type="submit" value="전송" />
	</form>
	
	<hr />
	
	<h4>korParam: ${param.korParam}</h4>
	
	
</body>
</html>