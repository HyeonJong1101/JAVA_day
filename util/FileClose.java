package kr.ac.kopo.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileClose {

	public static void close(InputStream is) {
		if(is != null) {
			try {
				is.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(InputStream is, InputStream is2) {
		close(is);
		close(is2);
	}
	
	public static void close(OutputStream os, OutputStream os2) {
		close(os);
		close(os2);
	}

	public static void close(FileWriter fw, PrintWriter pw) {
		// TODO Auto-generated method stub
	
	}

	public static void close(BufferedReader br, FileReader fr) {
		// TODO Auto-generated method stub
		
	}
	
	
}
