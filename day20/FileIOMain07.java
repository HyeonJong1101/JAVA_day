package kr.ac.kopo.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain07 {
	public static void main(String[] args) {
		System.out.println(args.length);
	
		
		if(args.length != 2) {
			System.out.println("인자가 부족합니다");
			System.out.println("java FileIOMain07 원본파일명 대사파일명");
			System.exit(0);
		}
		
		File sorce = new File(args[0]);
		if(!sorce.exists() || !sorce.isFile()) {
			System.out.println(args[0]+"파일은 존재x");
		}
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(sorce);
			fos = new FileOutputStream(args[1]);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			System.out.println(args[0]+ "파일을 "+args[1]+"파일에 복사완뇨");
		}catch(FileNotFoundException e) {
			System.out.println("x");
			System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			FileClose.close(bis,fis);
			FileClose.close(bos,fos);
		}
		
		 
	}
}

