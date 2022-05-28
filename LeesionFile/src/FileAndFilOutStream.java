import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileAndFilOutStream {
	public static void main(String[] args) {
		// phan 1. file class

	File file = new File("vidu.txt");
	if(file.exists()) {
		System.out.println("File exists ");
	} else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Not Found");
	}

		// Phan 2: ghi du lieu vao File

		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);

		try {
			fos = new FileOutputStream("test.txt");

//		String line = "CAP VAN QUY";
//		byte[] b = line.getBytes();
//		fos.write(b);

			for (;;) {
				System.out.println("Insert line into file (0 = exit): ");
				String line = sc.nextLine() + "\n";
				byte[] b = line.getBytes();
				fos.write(b);
				String choose;
				System.out.print("You want continue Y/N: ");
				choose = sc.nextLine();
				if(choose.equalsIgnoreCase("N")) {
					break;
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
