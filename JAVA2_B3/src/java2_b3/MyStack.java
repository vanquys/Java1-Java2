/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class MyStack<K, T>{
    List<T> list ;
    K mKey;
    public MyStack(K key){
        list = new ArrayList<T>();
        mKey = key;
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void displayKey(){
        System.out.println(mKey);
    }
    
    public T seek(){
        return list.get(0); 
    }
    public T pop(){
        return list.remove(0); 
    }
    public void push(T a){
        list.add(a);
    }
    public static void main(String[] args) {
        MyStack <String, Integer> myGenericStack = new MyStack<String, Integer>("Stack of Integer ");
        
        myGenericStack.push(4);
        myGenericStack.push(5);
        myGenericStack.push(6);
        myGenericStack.push(7);
    
        System.out.println("seek is: "+myGenericStack.seek());
        System.out.println("");
        
        System.out.println(myGenericStack.pop());
        System.out.println(myGenericStack.pop());
        System.out.println(myGenericStack.pop());
        System.out.println(myGenericStack.pop());
    
        myGenericStack.displayKey();
        
    }
}
