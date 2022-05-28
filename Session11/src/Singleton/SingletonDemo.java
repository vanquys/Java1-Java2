package Singleton;

public class SingletonDemo {
	private static SingletonDemo singletonDemo = null;
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getInstance() {
		if (singletonDemo == null) {
			singletonDemo = new SingletonDemo();
		}
		return singletonDemo;
	}
	public void display() {
		System.out.println("welcometo Singleton Design pattenrt");
	}
}
