package kr.ac.kopo.day20;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain09 {

	public static void write() {
		
		UserInfo user = new UserInfo("홍길동",20,"010-1111-2222");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("io/userInfo.dat");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			oos.flush();
			System.out.println("userInfo저장완뇨..");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(oos,fos);
		}
	}
	
	public static void main(String[] args) {
		
		write();
	}
}
