import java.io.Serializable;

public class Employee implements Serializable {
	int mId;
	String mName;
	String mAddress;
	int mAge;
	public Employee(int mId, String name, String mAddress, int mAge) {
		this.mId = mId;
		this.mName = name;
		this.mAddress = mAddress;
		this.mAge = mAge;
	}
	/**
	 * @return the mId
	 */
	public int getmId() {
		return mId;
	}
	/**
	 * @param mId the mId to set
	 */
	public void setmId(int mId) {
		this.mId = mId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return mName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.mName = name;
	}
	/**
	 * @return the mAddress
	 */
	public String getmAddress() {
		return mAddress;
	}
	/**
	 * @param mAddress the mAddress to set
	 */
	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}
	/**
	 * @return the mAge
	 */
	public int getmAge() {
		return mAge;
	}
	/**
	 * @param mAge the mAge to set
	 */
	public void setmAge(int mAge) {
		this.mAge = mAge;
	}
	
	private void display() {
	 System.out.printf("%-10d %-20s %-20s %-10d\n", mId, mName, mAddress, mAge);
	}
}
