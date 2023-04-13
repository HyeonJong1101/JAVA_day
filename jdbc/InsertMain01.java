package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain01 {
	
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.데이터 연결 후 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url,user,password);
			
			System.out.println(conn);
			
			//3.쿼리를 생성해서 실행
			stmt = conn.createStatement();
			String sql = "insert into t_test(id, name) values('kang2', '강길동2')";
						
			//4.실행결과 얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.err.println("총"+cnt+"개 행이 삽입");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//5.접속종료
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
