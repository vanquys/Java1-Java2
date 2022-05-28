/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

import static java2_b2.RegularExpression.matchIsingPattern;

/**
 *
 * @author ADMIN
 */
public class KiemTraGmail {

    public static void main(String[] args) {
        String regex;
        String input;
        regex = "^([a-zA-Z0-9\\-\\_\\.]+)(@gmail.com)$";
        input = "aasa@gmail.com";

        matchIsingPattern(regex, input);

        
        
        regex = "^([a-zA-Z0-9\\-\\_\\.]+)(@yahoo.com)(.vn)?";
        input = "aasa@yahoo.com";

        matchIsingPattern(regex, input);
        input = "aas45a@yahoo.com.vn";

        matchIsingPattern(regex, input);
       
        
        
        
        regex = "^([a-zA-Z0-9\\-\\_\\.]+)(@yahoo.com)(.vn)?";
        input = "aasa@yahoo.com";

       
        
        regex = "^([\\d])(.{0,8})([a-zA-Z]$)";
        input = "0sdsa";
        matchIsingPattern(regex, input);
        input = "20svvdff3df";
        matchIsingPattern(regex, input);
        
        
        
        regex = "^([\\d])([a-zA-Z]+).*(\\d)([a-zA-Z]$)";
        input = "0s2a";
        matchIsingPattern(regex, input);
        input = "2svvdff3f3";
        matchIsingPattern(regex, input);
        
        // kim tra sdt
        
        regex = "^(0|\\+84)\\d{9}$";
       
        input = "0123456789";
        matchIsingPattern(regex, input);
        
                
        
        
    }

}
