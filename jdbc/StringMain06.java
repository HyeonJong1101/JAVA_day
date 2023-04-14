package kr.ac.kopo.jdbc;

public class StringMain06 {

	public static void main(String[] args) {
		
		String data = "";
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			data += i;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.+"초");
		
		StringBuilder sb = new StringBuilder();
		long start2 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			sb.append(i); 
		}
		long end2 = System.currentTimeMillis();
		System.out.println((end2-start2)/1000.+"초");
		
		StringBuffer sbf = new StringBuffer();
		long start3 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			sbf.append(i); 
		}
		long end3 = System.currentTimeMillis();
		System.out.println((end3-start3)/1000.+"초");
	}
}
