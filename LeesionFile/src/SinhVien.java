import java.nio.CharBuffer;

public class SinhVien {
	String maSV;
	String TenSV;
	public SinhVien(String maSV, String tenSV) {
		this.maSV = maSV;
		TenSV = tenSV;
	}
	/**
	 * @return the maSV
	 */
	public String getMaSV() {
		return maSV;
	}
	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	/**
	 * @return the tenSV
	 */
	public String getTenSV() {
		return TenSV;
	}
	/**
	 * @param tenSV the tenSV to set
	 */
	public void setTenSV(String tenSV) {
		TenSV = tenSV;
	}

	@Override
	public String toString() {
		return maSV + " - " + TenSV;
	}
}
