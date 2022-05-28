package java2_b5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cau3b {
 public static void main(String[] args) throws IOException{
	FileReader fr = null;
	try {
		fr = new FileReader("C:/JavaText/bai3b.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
	} catch (Exception e) {
		System.out.println(e.toString());
		
	} finally {
		try {
			if(fr!=null) {
				fr.close();
				
			}
		} catch (IOException e2) {
			System.out.println(e2.toString());
		}
	}
}
}
