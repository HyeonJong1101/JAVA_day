package kr.ac.kopo.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain05 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("io/FileIOMain02.java.txt");
			fw = new FileWriter("io/FileIOMain02-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			System.out.println("ok");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}
}
