package kr.ac.kopo.day19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain03 {

	public static void write() {
		//data.txt에 저장
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("io/dataIO.txt");
			dos = new DataOutputStream(fos);
			
			int a = 59;
			char b = 'M';
			int c = 109;
			double d = 12.34;
			
			dos.writeInt(a);
			dos.writeChar(b);
			dos.writeInt(c);
			dos.writeDouble(d);
			dos.flush();
			
			System.out.println("ok");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(dos,fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		
		try {
			fis = new FileInputStream("io/dataIO.txt");
			dis = new DataInputStream(fis);
			
			int a = dis.readInt();
			char b = dis.readChar();
			int c = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	public static void main(String[] args) {
		read();
		//write();
	}
}
