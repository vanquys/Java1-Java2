package java2_b5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class cau4 {
	public static void coppy(String sourcceFile, String distinationFile) {
		FileInputStream FileInputStream = null;
		FileOutputStream FileOutputStream = null;

		try {
			try {
				FileInputStream = new FileInputStream(sourcceFile);
			} catch (Exception e) {
				System.out.println("File ko ton tai !");
			}
			FileOutputStream = new FileOutputStream(distinationFile);
			int ch = FileInputStream.read();
			while (ch != -1) {
				FileOutputStream.write(ch);
				ch = FileInputStream.read();
			}
		} catch (Exception e2) {
			System.out.println(e2.toString());
		}
		finally {
			try {
				if(FileInputStream != null) {
					FileInputStream.close();
				}
				if(FileOutputStream != null) {
					FileInputStream.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		coppy("C:/JavaText/bai4Input.txt", "C:/JavaText/bai4Output");
		
	}
	
}
