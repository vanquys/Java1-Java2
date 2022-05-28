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
public class ObjecClass {
    Integer num ;

    public ObjecClass() {
    }

    
    public ObjecClass(Integer num) {
        this.num = num;
    }
    
    public void getStringFrom(){
        System.out.println("String Form Of num is: " + num.toString());
        
    }
    
    public static void main(String[] args) {
        ObjecClass o1 = new  ObjecClass(20);
        ObjecClass o2 = new  ObjecClass(20);
        
        o1.getStringFrom();
        
        System.out.println("class ís: " + o1.getClass());
        
        if(o1.equals(o2)){
            System.out.println("equal !");
        } else {
            System.out.println("Object are not equal");
            
            o2 = o1;
        }
         if(o1.equals(o2)){
            System.out.println("equal");
        } else {
            System.out.println("Object are not equal");
        }
        
         
    }
    
    
}
