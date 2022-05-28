package java2_b5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class cau2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập kí tự cần tìm: ");
		char kytu = scanner.next().charAt(0);

		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Java\\hi.txt");
			int count = 0;
			int ch = fileInputStream.read();
			while (ch != -1) {
				System.out.print((char) ch);
				if (ch == kytu) {
					count++;
				}
				ch = fileInputStream.read();
			}
			System.out.println("\nCo " + count + " ky tu \"" + kytu + "\"trong tap tin.");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (IOException ex) {

			}
		}
	}
}
