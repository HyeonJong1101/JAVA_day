package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class UpdateMain02 {

	public static void main(String[] args) {

		String sql  = "update t_test ";	
	           sql += "set name=? ";
		       sql += "where id=? ";
		try (
			Scanner sc = new Scanner(System.in);
			Connection conn = new ConnectionFactory().getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {

			System.out.print("아이디를 입력 : ");
			String id = sc.nextLine();
			System.out.print("변경할 아이디를 입력 : ");
			String name = sc.nextLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			int cnt = pstmt.executeUpdate();
			if(cnt == 0) {
				System.out.println("아이디가 없음");
			}else {
				System.out.println("Complete!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
