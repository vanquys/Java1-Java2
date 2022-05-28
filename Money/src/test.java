
public class test {
	public static void main(String[] args) {
		Money m1 = new Money("mn112", 123);
		Money m2 = new Money("mn113", 223);
		Money m3 = new Money("mn114", 123);
		
		WrongVoucher w1 = new WrongVoucher("mn112", 123, "Chicago S1");
		WrongVoucher w2 = new WrongVoucher("mn113", 11808873, "Ch fdf S1");
		WrongVoucher w3 = new WrongVoucher("mn112", 123, "Chicago S1");
		
		
		Voucher vou1 = new Voucher("stor1", "mn121", 100);
		Voucher vou2 = new Voucher("stor2", "mn131", 110);
		Voucher vou3 = new Voucher("stor3", "mn141", 120);
		
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m2));
		
		System.out.println(w1.equals(w3));
		System.out.println(w2.equals(w1));
		
		System.out.println();
		System.out.println(m1.equals(w1));
		System.out.println(w1.equals(m1));
		
		System.out.println();
	
		System.out.println();
	}
}