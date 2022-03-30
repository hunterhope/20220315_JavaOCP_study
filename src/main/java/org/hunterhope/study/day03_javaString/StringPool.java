/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day03_javaString;

/**
 *
 * @author user
 */
public class StringPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new StringBuilder(s1).toString();
        String s3 = new StringBuilder(s1).toString().intern();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

}
