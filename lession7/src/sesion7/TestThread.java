package sesion7;

public class TestThread extends Thread {
	String name;
	
	public void run() {
		int count = 0;
		while (count <= 3) {
			System.out.println(Thread.activeCount());
			name = Thread.currentThread().getName();
			count++;
			System.out.println(name);
			if (name.equals("Threadl")) {
				System.out.println("Marimba");
			} else {
				System.out.println("Jini");
			}
		}
	}
	public static void main(String[] args) {
		TestThread a = new TestThread();
		a.setName("Threadl");
		a.run();
		a.start();
		
	}
}
