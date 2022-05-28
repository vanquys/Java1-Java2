package java_Bai61;

import java.util.ArrayList;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
		
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
		
	}

	public void hienThiSv() {
		for (SinhVien sinhVien : danhSach) {
			sinhVien.hienThiThongTin();
		}

	}
	
	
	
	
}
