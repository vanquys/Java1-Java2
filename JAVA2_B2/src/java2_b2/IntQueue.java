/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class IntQueue {

    List<Integer> list;

    public IntQueue() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(Integer obj) {
        list.add(0, obj);
    }
    public Integer get() {
        int a = list.size() - 1;
        Integer obj = list.get(a);
        list.remove(a);
        return obj;

    }

    public static void main(String[] args) {
        IntQueue myQueue = new IntQueue();
        myQueue.add(new Integer(1));
        myQueue.add(new Integer(2));
        myQueue.add(new Integer(3));
        myQueue.add(new Integer(4));
 
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
        System.out.println(myQueue.get());
    }

}
