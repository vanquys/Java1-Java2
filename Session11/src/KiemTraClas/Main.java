package KiemTraClas;

public class Main {
	public static void main(String[] args) {
		Ployee emp = new Ployee(700, "nam", "abc", 0);
		Ployee m1 = new Manage(700, "nu", "abc", 0);
	
		if (emp instanceof Ployee) {
			emp.bonus = 7000;
		}
		System.out.println(emp.bonus);
	}
}
