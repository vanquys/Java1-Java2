/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class FloatQueue {
        Vector<Float> list;

    public FloatQueue() {
        list = new Vector<>();
    }
    
    public void add(Float obj){
        list.add(0, obj);
    }
    public float get(){
        int a = list.size() - 1;
        Float obj = list.elementAt(a);
        list.remove(a);
        return obj;
        
    }
    public static void main(String[] args) {
        FloatQueue myQueue = new FloatQueue();
        myQueue.add( new Float(1.2));
        myQueue.add( new Float(2.3));
        myQueue.add( new Float(4.5));
        myQueue.add( new Float(6.7));
        
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
    }
}
