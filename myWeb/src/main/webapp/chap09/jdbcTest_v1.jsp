<%@ page contentType="text/html; charset=UTF-8" import="java.sql.*" %>

<%
// [초기화 작업]----------------
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
	String sql = "";
	String contents = "";
	
	if(conn == null){
		try{
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
// [회원 등록 작업] -----------------
	if(request.getMethod().equals("POST")){
		request.setCharacterEncoding("UTF-8");
		
		sql = "insert into user_info (username, email) values(?, ?)";
		
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("username"));
			pstmt.setString(2, request.getParameter("email"));
			
			pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(pstmt != null){
				try{
					pstmt.close();
					
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
// [회원 전체 조회 작업] ---------------
	sql = "select username, email from user_info";
	
	try{
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			contents += "<li>이름: " + rs.getString("username") +
					" | 이메일: " + rs.getString("email") + "</li>";
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(stmt != null){
			try{
				stmt.close();
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jdbcTest_v1.jsp</title>
</head>
<body>

	<h2>회원 등록 및 조회</h2>
	<hr />
	
	<form method="POST">
	<fieldset>
		<legend>회원 등록</legend>
		
		<label for="username">이름: </label>
		<input type="text" name="username" id="username" required />
		
		<label for="email">이메일: </label>
		<input type="email" name="email" id="email" required />
		
		<input type="submit" value="등록" />
	</fieldset>
	</form>
	
	<hr />
	
	<h3>전체 회원 목록</h3>
	<ol>
		<%= contents %>
	</ol>
	
</body>
</html>