package kr.ac.kopo.day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileMain02 {

	public static void main(String[] args) {
		/*
		System.out.println("문자를 입력하세요 Ctrl+z 입력시 종료");
		InputStream is = System.in;
		
		while(true) {
			
			try {
				int c = is.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		System.out.println("문자를 입력하세요 Ctrl+z 입력시 종료");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		while(true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
