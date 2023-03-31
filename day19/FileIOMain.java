package kr.ac.kopo.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain {
	
	//iotest/image.jpg 파일을 iotest/image2.jpg.dp 에 복사
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("io/Lighthouse.jpg");
			fos = new FileOutputStream("io/Lighthouse2.jpg");
			
			long start = System.currentTimeMillis();
			
			while(true) {
				int c = fis.read();
				if(c==-1) break;
				fos.write(c);
			}
			fos.flush();
			long end = System.currentTimeMillis();
			System.out.println("복사완뇨");
			
			System.out.println("소요시간 : " + (end-start)/1000.+"초");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
