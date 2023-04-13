package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMain03 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.데이터 연결 후 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url,user,password);
			
			System.out.println(conn);
			
			//3.쿼리실행
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("삽입할 아이디입력: ");
			String id = sc.nextLine();
			
			System.out.println("삽입할 이름입력: ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name) values(?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			
			//4단계 결과얻어오기
			int cnt = pstmt.executeUpdate();
			System.out.println("총"+ cnt+ "개 행 삽입...");
		}catch(Exception e) {
			
		}
	}
}
