package kr.ac.kopo.day19.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain2 {

	public static void main(String[] args) {
		
		/*
		Member M = new Member("a", "111");
		System.out.println(M.toString());
		*/
		
		List<Member> members = new ArrayList<>();
		members.add(new Member("aaa","111"));
		members.add(new Member("bbb","222"));
		members.add(new Member("ccc","333"));
		members.add(new Member("ddd","444"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***비밀번호 변경 서비스***");
		System.out.println("아이디를 입력");
		String id= sc.nextLine();
		
		int index = members.indexOf(new Member(id));
		//boolean bool = members.contains(new Member(id));
		if(index == -1) {
			System.out.println("입력하신 " + id + " 없음");
			System.exit(0);
		}
		
		Member mem = members.get(index);
		
		System.out.println("패스워드를 입력하세요");
		String password = sc.nextLine();
		
		
		if(!mem.getPassword().equals(password)) {
			System.out.println("패스워드가 올바르지않습니다.");
			System.exit(0);
		}
		
		System.out.println("변경할 비밀번호입력:");
		mem.setPassword(sc.nextLine());
		System.out.println("패스원드 변경완료");
		System.out.println("=====================");
		System.out.println("전체회원 목록출력");
		System.out.println("아이디\t패스워드");
		System.out.println("=====================");
		
		for(Member i : members) {
			System.out.println(i.getId()+"\t"+i.getPassword());
		}
		
	}
}
