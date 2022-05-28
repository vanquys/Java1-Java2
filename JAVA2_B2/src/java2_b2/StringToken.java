/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_b2;

import java.util.StringTokenizer;

/**
 *
 * @author ADMIN
 */
public class StringToken {

    public static void main(String[] args) {
        StringTokenizer st  = new StringTokenizer("this, is , token" ,",");
        while (st.hasMoreTokens()) {            
            System.out.println(st.nextToken());
        }
    }
}
