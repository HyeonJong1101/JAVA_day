package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import kr.ac.kopo.util.JDBCClose;

public class InsertMain02 {
	
	public static void main(String[] args) {
		
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 드라이버연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url,user,password);
			
			System.out.println(conn);

			//3. 쿼리실행
			Scanner sc = new Scanner(System.in);
			
			System.out.println("삽입할 아이디입력: ");
			String id = sc.nextLine();
			
			System.out.println("삽입할 이름입력: ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name)";
			sql += "values(\'"+id+"\',\'"+name+"\')";
			
			System.out.println(sql);
			stmt = conn.createStatement();
			
			//4. 결과얻어오기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총"+ cnt + "개 행 삽입");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//5. 종료
			/*
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
			*/
			JDBCClose.close(stmt, conn);
		}
	}
}
