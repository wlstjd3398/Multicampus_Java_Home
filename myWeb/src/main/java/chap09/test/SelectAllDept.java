package chap09.test;

import java.sql.*;

public class SelectAllDept {

	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			stmt = conn.createStatement();
			String sql = "select * from dept";
			rs = stmt.executeQuery(sql);
			
			int deptno;
			String dname, loc;
			
			while(rs.next()) {
				deptno = rs.getInt("deptno");
				dname = rs.getString("dname");
				loc = rs.getString("loc");
			
				System.out.printf("부서번호: %d | 부서명: %-10s | 부서위치: %s \n", deptno, dname, loc);
			}
			
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
