/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

/**
 *
 * @author ADMIN
 */
public class SystemTest {
    private int[] mArr1 = {1,2,4,5};
    private int[] mArr2 = {5,6,7,4,4};
    
    public void coppyArray(){
        System.out.println("Array berfore coppy : ");
        for (int i = 0; i < mArr2.length; i++) {
            System.out.print(mArr2[i] + " ");
        }
        System.out.println("");
        System.arraycopy(mArr1, 0, mArr2, 0, 3);
        
        
        System.out.println("Array after coppy : ");
        for (int i = 0; i < mArr2.length; i++) {
            System.out.print(mArr2[i] + " ");
        }
        System.out.println(""); 
   }
    
    public void getTime(){
        System.out.println("Current time: " + System.currentTimeMillis());
    }
    public void getPath(String variable){
        System.out.println("Path is: " + System.getenv(variable));
    }

    public static void main(String[] args) {
        SystemTest o = new SystemTest();
        
        o.coppyArray();
        o.getTime();
        o.getPath("Path");
    }
}

