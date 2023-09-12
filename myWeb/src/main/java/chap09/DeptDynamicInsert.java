package chap09;

import java.sql.*;
import java.util.*;

public class DeptDynamicInsert {
	
	public static void main(String[] args) {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String dept;
		String [] deptInfo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로운 부서 정보를 입력하세요: "); // 50 개발부 서울
		dept = sc.nextLine(); // 사용자가 입력한 전체를 하나의 문자열로 읽음
		sc.close();
		
		deptInfo = dept.split(" ");
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, "scott", "tiger");
			String sql = "insert into dept values (?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(deptInfo[0]));
			pstmt.setString(2, deptInfo[1]);
			pstmt.setString(3, deptInfo[2]);
			
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