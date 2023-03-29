package kr.ac.kopo.day15;

import java.util.ArrayList;
import java.util.List;

/*
 	기본자료형			참조자료형
 	boolean			Boolean
 	char			Char
 	byte			Byte
 	short			Short
 	int				Integer
 	long			Long
 	float			Float
 	double			Double
 */
public class WrapperMain {
	
	public static void main(String[] args) {
		
		int i = 12;
		System.out.println(i);
		
		Integer i2  = new Integer(12);
		System.out.println(i2);
		
		int i3 = i2;    // auto unboxing 
		Integer i4 = i; // auto boxing
		
		List<Integer> list = new ArrayList<>();
		
		list.add(new Integer(100));
		list.add(100); //auto boxing
		
		double a = 1.2;
		Double a2 = new Double(1.3);
		
		Double a3 = a; //auto boxing
	}
}
