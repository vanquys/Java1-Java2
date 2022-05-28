package MyThread;

public class RunableTest {
	public static void main(String[] args) {
		System.out.println("Main runable running");
		
		MyRunable myRunable = new MyRunable();
		
		Thread t1 = new Thread(myRunable);
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread stopped");
	}
}
