package chap09.test;

import java.sql.*;

public class DeptSelect2 {

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
			String sql = "select * from dept where deptno = 20";
			rs = stmt.executeQuery(sql);
			DeptDO deptDO = new DeptDO();
//			 기존에는 반복되는 행의 수만큼 반복하고 끝냄
//			while(rs.next()) {
//			
//		}
			int deptno;
			String dname, loc;
			
			// 하나의 행을 가져옴
			if(rs.next()) {
				deptDO.setDeptno(rs.getInt("deptno"));
				deptDO.setDname(rs.getString("dname"));
				deptDO.setLoc(rs.getString("loc"));
			
				System.out.println("부서번호: " + deptDO.getDeptno() + ", 부서명: " + deptDO.getDname() + ", 부서위치: " + deptDO.getLoc());
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