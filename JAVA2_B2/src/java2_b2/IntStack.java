package java2_b2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author OS
 */
public class IntStack {
    List<Integer> list;

    public IntStack() {
        list = new java.util.ArrayList<>();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(Integer obj){
        list.add(0 , obj);
    }
    public Integer seek(){
        Integer obj = null;
        if(!isEmpty()){
            obj = list.get(0);
        }    
        return obj;
    }
    public Integer pop(){
        Integer obj = list.get(0);
        list.remove(0);
        return obj;
        
    }
    
    
    public static void main(String[] args) {
        IntStack myInstack = new IntStack();
        myInstack.push(new  Integer(5));
        myInstack.push(new  Integer(2));
        myInstack.push(new  Integer(6));
        myInstack.push(new  Integer(10));
    
        System.out.println("Element first of stack is: " + myInstack.seek());
    
        System.out.println("");
        
        System.out.println(myInstack.pop());
        System.out.println(myInstack.pop());
        System.out.println(myInstack.pop());
        System.out.println(myInstack.pop());
    }
}