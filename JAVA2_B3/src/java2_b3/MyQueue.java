/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b3;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class MyQueue<K, T>{
        Vector<T> list;
        K mKey;
        
    public MyQueue(K key) {   
        list = new Vector<T>();
        mKey = key;
    }
    
    
    public void add(T obj){
        list.add(0, obj);
    }
    public T get(){
        int a = list.size() - 1;
        T obj = list.elementAt(a);
        list.remove(a);
        return obj;
        
    }
    public static void main(String[] args) {
        MyQueue<String, Float> myQueue = new MyQueue<String, int>("hi");
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
