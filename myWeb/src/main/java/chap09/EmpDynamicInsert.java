package chap09;

import java.sql.*;
import java.util.*;

public class EmpDynamicInsert {
	
	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			String sql = "insert into emp(empno, ename, job, sal, hiredate) " +
							"values (?, ?, ?, ?, to_date(?, 'YYYY-MM-DD HH24:MI:SS'))";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 9999);
			pstmt.setString(2, "SEONG");
			pstmt.setString(3, "CLERK");
			pstmt.setInt(4, 1700);
			pstmt.setString(5, "2023-09-12 16:44:30");
			
			int rowCount = pstmt.executeUpdate();
			
			System.out.println(rowCount + "개의 행을 입력했습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}