import java.util.Iterator;

public class Calculator {
	int result;

	public void divide(int num1, int num2) throws ArithmeticException {
		if (num2 == 0) {
			throw new ArithmeticException();
		}
		int result = num1 / num2;
		System.out.println("result = " + result);

	}

	public static void main(String[] args) {
		try {
			Calculator x = new Calculator();
			 x.divide(1, 0);
		} catch (ArithmeticException o) {
			System.out.println(o);
		}
		

//        x.divide(1, 0);

//		
//		String a = "7";
//		String b = "1";
//		int sum = 0;
//		int Marks[] = { 20, 60, 70 };
//
//		try {
//			int result = Integer.parseInt(a) / Integer.parseInt(b);
//			System.out.println("result = " + result);
//
//			for (int i = 0; i < 4; i++) {
//				sum += Marks[i];
//			}
//			System.out.println("sum = " + sum);
//
//		} catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException o) {
//			System.out.println("eRROR message: " + o.getMessage());
//
//		}

	}
}
