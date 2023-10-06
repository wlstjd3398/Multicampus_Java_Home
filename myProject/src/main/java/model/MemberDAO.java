package model;

import java.sql.*;
import java.util.*;

public class MemberDAO {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	
	public MemberDAO() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		try {
			// 에러가 발생할수있는 코드
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			
			System.out.println("JDBC 연결 성공!");
		}
		catch(Exception e) {
			System.out.println("JDBC 연결 실패!");
			e.printStackTrace();
		}
	}
	
	public MemberDO getMember(String id) {
		MemberDO member = null;
		this.sql = "select id, passwd, name, to_char(regdate, 'YYYY-MM-DD HH24:MI:SS') as regdate, grade" +
		           " from member where id = ?";
		
		try {
			this.pstmt = conn.prepareStatement(sql);
			
			this.pstmt.setString(1, id);
			
			rs = this.pstmt.executeQuery();
			
			if(this.rs.next()) {
				member = new MemberDO();
				
				member.setId(this.rs.getString("id"));
				member.setPasswd(this.rs.getString("passwd"));
				member.setName(this.rs.getString("name"));
				member.setRegdate(this.rs.getString("regdate"));
				member.setGrade(this.rs.getInt("grade"));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
	
	public int insertMember(MemberDO member) throws Exception {
		int rowCount = 0;
		boolean isIdDuplicate = false;
		
		try {
			this.conn.setAutoCommit(false);
			
			this.sql = "select id from member where id = ?";
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, member.getId());			
			this.rs = pstmt.executeQuery();
			
			if(!rs.next()) {
				this.sql = "insert into member (id, passwd, name) values (?, ?, ?)";
				pstmt = conn.prepareStatement(sql);			
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPasswd());
				pstmt.setString(3, member.getName());
				
				rowCount = pstmt.executeUpdate();
				this.conn.commit();
			}
			else {
				isIdDuplicate = true;
				this.conn.rollback();
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {			
			try {
				this.conn.setAutoCommit(true);
				
				if(!pstmt.isClosed()) {
					pstmt.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		if(isIdDuplicate) {
			throw new Exception("아이디가 중복되었습니다.");
		}
		return rowCount;
	}
	
	
	public void closeConn() {
		try {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}