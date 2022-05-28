package MyThread;

public class MyThread extends Thread{
	@Override
	public void run() {
		int index = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+ index++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("==> " + this.getName() + "Stopped");
		
	}
}
