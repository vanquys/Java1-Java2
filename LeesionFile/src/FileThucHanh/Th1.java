package FileThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Th1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream("th1.txt");
		 
		 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
