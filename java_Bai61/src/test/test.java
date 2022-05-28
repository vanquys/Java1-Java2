package test;

import java.util.Iterator;
import java.util.Scanner;

import java_Bai61.DanhSachSinhVien;
import java_Bai61.SinhVien;

public class test {

	DanhSachSinhVien dssv = new DanhSachSinhVien();

	public void themSv() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("nhap ma sinh viên: ");
			String maSinhVien = sc.nextLine();
			if (!(maSinhVien.isEmpty())) {
				System.out.println("nhap Ho Ten sinh viên: ");
				String hoTen = sc.nextLine();
				System.out.println("nhap nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("nhap diem trung binh : ");
				Float diemTrungBinh = sc.nextFloat();

				SinhVien sv = new SinhVien(maSinhVien, hoTen, namSinh, namSinh);
				dssv.themSinhVien(sv);
				sc.nextLine();
			} else
				break;
		}

		

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;

		do {

			System.out.println("____MENU______.");
			System.out.println("1.  them dssv .");
			System.out.println("2.  in dssv .");
			System.out.println("3.  kiem tra có rỗng không");
			System.out.println("4.  them dssv .");
			System.out.println("5.  them dssv .");
			System.out.println("6.  them dssv .");
			System.out.println("7.  them dssv .");
			System.out.println("0.  exit");
			System.out.println();
			System.out.println("nhap : ");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				themSv();
			case 2:
				dssv.hienThiSv();

			case 3:
			}
			System.out.println();

		} while (luaChon != 0);

	}

	public static void main(String[] args) {

		test o = new test();
		o.run();
	}
}
