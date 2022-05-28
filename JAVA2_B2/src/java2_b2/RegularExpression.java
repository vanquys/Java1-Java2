/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class RegularExpression {

    public static void matchIsingPatternAndMatcher(String regex, String str) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        boolean result = m.matches();

        System.out.println(str + " has match with " + regex + " is: " + result);
        System.out.println("Match using Pattetn and Matcher");
    }
    
    public static void matchIsingPattern(String regex, String str) {
        
        boolean result = Pattern.matches(regex, str);

        System.out.println(str + " has match with " + regex + " is: " + result);
        System.out.println("Match using Pattetn");
    }
    public static void matchIsingString(String regex, String str) {
        
        boolean result = str.matches(regex);

        System.out.println(str + " has match with " + regex + " is: " + result);
     
    }


//    public static void main(String[] args) {
//        // khớp với bất kì kí tự nào 
//        // quy tắc: .
//        
//        matchIsingString(".", "a");
//        matchIsingString(".", "7");
//        
//        // khớp với bất kì kí tự nào (0 hoặc nhìu kí tự)
//        // quy tac:  .*
//        
//        matchIsingString(".*", "777");
//        
//        // kiem tra chuổi có bắt đầu bằng chữ 's' hay không
//        // qui tắc: ^
//        
//        matchIsingString("^s.*", "sấdsss");
//        
//        
//        // ket thúc
//        // Quy tắc: $
//        
//        matchIsingString(".*s$", "dghfds");
//    
//    
//        
//    }


    // tách chuỗi thành mảng
    public static void splitWithString(String str, String regex){
        System.out.println(" " + str + " split With "+ regex + "is: ");
        
        String[] subArr = str.split(regex);
        for (String sub : subArr) {
            System.out.print(sub + " ");
        }
    }
    public static void main(String[] args) {
        
     
        String regex = "\\\\|:|;|: |,";
        splitWithString("trai\\dat\\quay\\quanh\\mat\\troi", regex);
        splitWithString("trai,dat,quay,quanh,mat,troi", regex);
        splitWithString("trai:dat:quay:quanh:mat:troi", regex);
        splitWithString("trai: dat: quay: quanh: mat: troi", regex);
    }
}

