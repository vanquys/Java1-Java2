package MyThread;

public class mainThread12 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		

		Thread2 th2 = new Thread2();
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
	}
}
