package chap09.test;

import java.sql.*;
import java.util.*;

public class SelectAllDept2 {

	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<DeptDO> listDO = new ArrayList<DeptDO>();
		
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			stmt = conn.createStatement();
			String sql = "select * from dept";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				DeptDO deptDO = new DeptDO();
				deptDO.setDeptno(rs.getInt("deptno"));
				deptDO.setDname(rs.getString("dname"));
				deptDO.setLoc(rs.getString("loc"));
			
				listDO.add(deptDO);
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
		
		for(DeptDO deptDO : listDO) {
			System.out.printf("부서번호: %d | 부서명: %-10s | 부서위치: %s \n", deptDO.getDeptno(), deptDO.getDname(), deptDO.getLoc());
		}
		
	}
}
