package MyThread;

import java.util.Iterator;

public class mainThread {
	public static void main(String[] args) {
		int idx = 1;
		for (int i = 0; i < 2; i++) {
			System.out.println("Main thread running");
			try {
				Thread.sleep(2101);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		MyThread t = new MyThread();
		t.setName("T1");
		t.start();

		MyThread t1 = new MyThread();
		t1.setName("T2");
		t1.start();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Main thread running " + idx++);
			try {
				Thread.sleep(2101);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(idx);
	}
}
