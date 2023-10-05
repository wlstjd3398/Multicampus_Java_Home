<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Insert &amp; List</title>
<link rel="stylesheet" href="/myProject/css/list.css" >
</head>
<body>

	<h2>회원 가입 &amp; 및 전체 회원 조회</h2>
	<hr/>
	
	<h3>[회원가입]</h3>
	
	<form method="POST" id="insertMember">
	<fieldset>
		<legend>회원 정보 입력</legend>
		
		<label for="id">아이디</label>
		<input type="email" name="id" id="id" placeholder="ex) example@gmail.com" required /><br />
		
		<label for="passwd">비밀번호</label>
		<input type="password" name="passwd" id="passwd" placeholder="4글자 이상" required /><br />
		
		<label for="repasswd">비밀번호 확인</label>
		<input type="password" id="repasswd" placeholder="동일 비밀번호 입력" required /><br />
		
		<label for="name">이름</label>
		<input type="text" name="name" id="name" placeholder="두글자 이상" required /> :::
		
		<input type="submit" value="가입" />
	</fieldset>
	</form>
	
	<div id="msg"></div>
	
	<hr />
	<h3>[전체 회원 조회]</h3>
	
	<table>
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>등록일</th>
			<th>회원정보수정</th>
		</tr>
		<tr>
			<td>1</td>
			<td>seong@gmail.com</td>
			<td>진성</td>
			<td>2023-10-05 14:23:42</td>
			<td><button>수정</button></td>
		</tr>
	</table>
	
</body>
</html>