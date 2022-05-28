package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	static List<Person> list = new ArrayList<Person>();
	private static void displayList() {
		for (Person p : list) {
			System.out.println("id: " + p.id + "  name: "+ p.name);
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person(1, "nhan");
		Person p2 = new Person(2, "hai");
		Person p3 = new Person(3, "canh");
		
		student st1 = new student(123, "ha",4);
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		displayList();
		
		System.out.println();
		
		list.remove(new Person(1, "nhan"));
		
		displayList();
		
		System.out.println(st1 instanceof Person);
		System.out.println(st1 instanceof student);
		
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof student);
		
		
		
	}

}
