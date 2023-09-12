package chap09;

import java.sql.*;
import java.util.Scanner;

public class DeptDynamicSelect {
	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int deptno;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서번호를 입력하세요: ");
		deptno = sc.nextInt();
		sc.close();
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			String sql = "select * from dept where deptno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
			DeptDO deptDO = new DeptDO();

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