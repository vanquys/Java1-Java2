
public class testGC {
	int num1;
	int num2;

	public testGC() {

	}

	public testGC(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void showNum() {
		System.out.println("num1 : " + num1);
		System.out.println("num2: " + num2);
	}

	public static void main(String[] args) {

		testGC o1 = new testGC(1, 2);
		testGC o2 = new testGC(4, 2);
		testGC o3 = null;

		System.out.println("o1");
		o1.showNum();
		System.out.println("o2");
		o2.showNum();
		System.out.println("o3");
		try {
			o3.showNum();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		o3 = o1;
		o1 = o2;
		o2 = o3;
		o3 = null;

		System.out.println("o1");
		o1.showNum();
		System.out.println("o2");
		o2.showNum();
		System.out.println("o3");
		try {
			o3.showNum();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println(o1.equals(o3));
	}

}
