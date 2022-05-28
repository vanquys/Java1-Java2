package MyThread;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("thread 2 :   " + i);
		}
	}
}
