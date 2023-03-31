package kr.ac.kopo.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.ac.kopo.util.FileClose;

public class FileIOMain02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("io/lighthouse.jpg");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("io/lighthouse2.jpg");
			bos = new BufferedOutputStream(fos);
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = bis.read();
				if(c == -1) break;
				bos.write(c);
			}
			bos.flush();
			
			long end = System.currentTimeMillis();
			System.out.println("복사완뇨");
			System.out.println("시간 :" + (end-start)/1000.+"초");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
			/*
			FileClose.close(bis);
			FileClose.close(fis);
			FileClose.close(bos);
			FileClose.close(fos);
			
			if(bis != null)
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bos != null)
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			*/
		}
		
		
	}
}
