/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ADMIN
 */
public class Student implements Comparable<Student>{

    private String mName;
    private String mClassNmae;
    private float mMark;

    public Student() {
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmClassNmae() {
        return mClassNmae;
    }

    public void setmClassNmae(String mClassNmae) {
        this.mClassNmae = mClassNmae;
    }

    public float getmMark() {
        return mMark;
    }

    public void setmMark(float mMark) {
        this.mMark = mMark;
    }

    /**
     * 
     * 
     * @param mName ten hs
     * @param mClassNmae lop hs
     * @param mMark diem hs
     */
    public Student(String mName, String mClassNmae, float mMark) {
        this.mName = mName;
        this.mClassNmae = mClassNmae;
        this.mMark = mMark;
    }
    
    /**
     * Hien thi student
     */
    public void display(){
        System.out.printf("%-30s %-10s %-10.2f\n", mName, mClassNmae, mMark);
    }
    
    /**
     * doi thanh chu Hoa 
     */
    public void upperCaseName(){
        mName = mName.toUpperCase();
    }    
    /**
     * doi thanh chu Thuong
     */
    public void loweCaseName(){
        mName = mName.toLowerCase();
    }

    @Override
    public int compareTo(Student o) {
        return this.mName.compareTo(o.mName);
    }
    
}
