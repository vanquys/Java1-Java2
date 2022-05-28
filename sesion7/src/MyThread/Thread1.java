package MyThread;

public class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("thread 1 :   " + i);
		}
	}
}
