package kr.ac.kopo.day18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 Key Value 쌍으로 이루어진 데이터 집합
 순서x, key에대한 중복x
 구현 클래스 : TreeMap HashMap
 메소드 : put(k,v) remove(k) get(k) putAll(sub) containsKey(k)
 * */

public class MapMain01 {

	/*비밀번호 변경시스템 구현*/
	public static void main(String[] args) {
		
		Map<String, String> members = new HashMap<>();
		
		members.put("A", "1111");
		members.put("B", "2222");
		members.put("C", "3333");
		members.put("D", "4444");
		
		System.out.println("전체회원수 : " + members.size());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***비밀번호 변경서비스***");
		System.out.print("변경할 아이디를 입력 : ");
		String id = sc.nextLine();
		
		if(!members.containsKey(id)) {
			System.out.println("입력하신 "+id+"가 없음니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("현재 비밀번호를 입력하시오 : ");
		String password = sc.nextLine();
		
		if(!members.get(id).equals(password)) {
			System.out.println("비밀번호가 다릅니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("변경할 비밀번호 입력 : ");
		members.put(id, sc.nextLine());
		System.out.println("패스워드 변경완료");
		
		System.out.println("=====================");
		System.out.println("전체회원 목록출력");
		System.out.println("아이디\t패스워드");
		System.out.println("=====================");
		
		Set<Entry<String, String>> ent = members.entrySet();		
		
		for(Entry<String, String> e : ent) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
		Set<String> keys = members.keySet();
		for(String key : keys) {
			System.out.println(key+"\t"+members.get(key));
		}
		
	}
}
