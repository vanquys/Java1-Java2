package MyThread;

public class MyRunable implements Runnable {
	@Override
	public void run() {
		int idx = 1;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Runnable demo "+ idx++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("==> stopped");
	}
}
