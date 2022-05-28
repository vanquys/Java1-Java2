/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class NumberList <T>{
    private T obj;
    public void add(T a){
        obj = a;
    }
    public static void main(String[] args) {
        NumberList<String> listObj = new NumberList<>();
        listObj.add("a");
        
    }
}
