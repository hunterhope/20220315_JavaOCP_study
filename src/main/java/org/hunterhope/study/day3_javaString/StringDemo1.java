/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day3_javaString;

/**
 *
 * @author user
 */
public class StringDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3="JAVA";
        
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));        
    }
    
}
