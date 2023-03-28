package kr.ac.kopo.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set : 순서X 중복X
 	구현 클래스 : HashSet TreeSet
 	method : add, remove, contain, size, clear, isEmpty
 */
public class SetMain {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("one");
		System.out.println(set.add("two"));
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println(set.add("two"));
		System.out.println(set);
		//set.remove("two");
		
		System.out.println(set.contains("one"));
		
		if(set.contains("two")) {
			set.remove("two");
			System.out.println("삭제성공");
		}else {
			System.out.println("존재하지않음");
		}
		
		if(set.contains("two")) {
			set.remove("two");
		}else {
			System.out.println("존재하지않음");
		}
		
		System.out.println(set.remove("two") ? "삭제" : "없음");
		
		//set의 전체데이터 접근법 1. 1.5버전의 for문  2.toArray()  3.Iterator
		
		System.out.println("<1.5버전의 for문>");
		for(String data:set) {
			System.out.println(data);
		}
		
		System.out.println("<toArray>");
		Object[] dataArr = set.toArray();

		for(Object i : dataArr) {
			System.out.println(i+"길이"+((String)i).length()); //Object형이기때문에 명시적형변화을 해주야함
		}
		
		System.out.println("<Iterator>");
		Iterator<String> ite =  set.iterator(); //hasNext() : 다음데이터 존재여부		next():데이터이동
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
