package chap09;

import java.sql.*;

public class EmpSelect {
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
			String sql = "select empno, ename, job, sal, to_char(hiredate, 'YYYY-MM-DD HH24:MI:SS') hiredate "
						+ "from emp where ename = 'SEONG'";
			rs = stmt.executeQuery(sql);
			
			int deptno;
			String dname, loc;
			
			if(rs.next()) {
				System.out.println(rs.getInt("empno") + " | " +rs.getString("ename") + " | " +
								rs.getString("job") + " | " + rs.getInt("sal") + " | " + rs.getString("hiredate"));
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
