package kr.ac.kopo.day18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	
	public static void main(String[] args) {
		
		/*
		File file = new File("io/a.txt");
		System.out.println(file.exists() ? "존재합니다" : "존재하지않습니다");
		System.out.println(file.isFile() ? "파일입니다" : "파일이아닙니다");
		System.out.println(file.isDirectory() ? "디렉토리입니다" : "디렉토리아닙니다");
		
		System.out.println("실제주소 :" + file.getAbsolutePath());
		System.out.println("path :" + file.getPath());
		System.out.println("폴더 :" + file.getParent());
		System.out.println("파일 :" + file.getName());
		System.out.println("파일크기 :" + file.length());
		System.out.println(file.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(file.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = file.lastModified();
		String pattern = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막수정날짜 :"+sdf.format(new Date(lastTime)));
		*/
		
		/*
		File file2 = new File("io/새폴더/강아지");
		System.out.println(file2.isDirectory() ? "디렉토리입니다" : "디렉토리아닙니다");
		file2.mkdirs();
		System.out.println(file2.isDirectory() ? "디렉토리입니다" : "디렉토리아닙니다");
		*/
		
		File file3 = new File("io");
		System.out.println("====================");
		System.out.println(file3.getPath() + "폴더");
		System.out.println("====================");
		String[] dateArr = file3.list();
		for(String date : dateArr) {
			System.out.println(date);
		}
		System.out.println("====================");
		
		
	}
}
