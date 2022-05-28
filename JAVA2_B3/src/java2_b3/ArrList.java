/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class ArrList {

    public static void main(String[] args) {
        List<String> listObj = new ArrayList<String>();
        System.out.println("size list : " + listObj.size());
   
        
        for (int obj = 1; obj <= 10; obj++) {
            listObj.add("Value is: " + new Integer(obj));
        }
        
        for (String string : listObj) {
            System.out.println(string);
        }
        listObj.clear();
        for (String string : listObj) {
            System.out.println(string);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        // vector
        Vector<String> vectorObj = new Vector<String>();
        System.out.println("size list : " + listObj.size());
   
        
        for (int obj = 1; obj <= 10; obj++) {
            vectorObj.add("Value is: " + new Integer(obj));
        }
        
        for (String string : vectorObj) {
            System.out.println(string);
        }
        vectorObj.clear();
        for (String string : vectorObj) {
            System.out.println(string);
        }
        
        
        // LinkedList
        LinkedList<String> linkedObj = new LinkedList<String>();
        System.out.println("size list : " + listObj.size());
   
        
       linkedObj.add("Jonh");
       linkedObj.add("Hana");
       linkedObj.add("Bili");
       linkedObj.add("Zasu");
        
        for (String string : linkedObj) {
            System.out.println(string);
        }
        linkedObj.removeAll(linkedObj);
        for (String string : linkedObj) {
            System.out.println(string);
        }
   
    }
}
