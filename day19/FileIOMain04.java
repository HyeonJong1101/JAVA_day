package kr.ac.kopo.day19;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain04 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("io/FileIOMain02.java.txt");
			fw = new FileWriter("io/FileIOMain02-1.java.txt");
			
			while(true) {
				int c = fr.read();
				if(c== -1) break;
				fw.write(c);
				fw.flush();
				System.out.println("ok");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}
}
