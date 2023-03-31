package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;

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
	
	
}
