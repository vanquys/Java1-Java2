import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BaiTapSinhVin {
	public static void main(String[] args) {
//		List<SinhVien> studentList = new ArrayList<SinhVien>();
//
//		studentList.add(new SinhVien("m1", "Han"));
//		studentList.add(new SinhVien("m2", "Nha"));
//		studentList.add(new SinhVien("m3", "Phu"));

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("vidu.txt");
			fos = new FileOutputStream("vidu.txt");
			int check;
			while ((check = fis.read()) != -1) {
				System.out.println(check);
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}