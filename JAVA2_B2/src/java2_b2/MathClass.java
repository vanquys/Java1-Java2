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
public class MathClass {
    int num1;
    int num2;

    public MathClass() {
    }

    public MathClass(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void doMax(){
        System.out.println("max: " + Math.max(num1, num2));
                
    }
    public void doMin(){
        System.out.println("min: " + Math.min(num1, num2));
                
    }
    public void doSquare(){
        System.out.println("Square: " + Math.sqrt(num1));
                
    }
    public void getRandom(){
        System.out.println("Random: " + Math.random());
               
    }
    
    public static void main(String[] args) {
        MathClass o = new MathClass(1,2);
        
        o.doMax();
        o.doMin();
        o.doSquare();
        o.getRandom();
    }
    
}
