package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<String>();
		List<String> list = new LinkedList<String>();
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		System.out.println(list.size());
		
		System.out.println("0번째 데이터 : " + list.get(0));
		System.out.println(list.remove(0)+"삭제");
		System.out.println("0번째 데이터 : " + list.get(0));
		System.out.println(list);
		list.add(2, "ten");
		System.out.println(list);
		
		System.out.println("<인덱스를 통한 전체데이터출력>");
		
		/*for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		for(String i : list) {
			System.out.println(i);
		}
		
		System.out.println(list.contains("three"));
		list.remove("three");
		System.out.println(list.contains("three"));
		
		List<String> sub = new ArrayList<String>();
		sub.add("하나");
		sub.add("둘");
		sub.add("셋");
		
		list.addAll(sub);
		System.out.println(list);
	}
}
