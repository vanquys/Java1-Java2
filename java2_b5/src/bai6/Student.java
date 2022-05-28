package bai6;

import java.io.Serializable;

public class Student implements Serializable {
	private String mName;
	private String mClassName;
	private float mMark;
	
	
	public Student() {
	}


	public Student(String mName, String mClassName, float mMark) {
		this.mName = mName;
		this.mClassName = mClassName;
		this.mMark = mMark;
	}


	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}


	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}


	/**
	 * @return the mClassName
	 */
	public String getmClassName() {
		return mClassName;
	}


	/**
	 * @param mClassName the mClassName to set
	 */
	public void setmClassName(String mClassName) {
		this.mClassName = mClassName;
	}


	/**
	 * @return the mMark
	 */
	public float getmMark() {
		return mMark;
	}


	/**
	 * @param mMark the mMark to set
	 */
	public void setmMark(float mMark) {
		this.mMark = mMark;
	}
	
	private void display() {
		System.out.printf("%-30s %-10s %-10.2f\n", mName,mClassName,mMark);
	}
	
}
