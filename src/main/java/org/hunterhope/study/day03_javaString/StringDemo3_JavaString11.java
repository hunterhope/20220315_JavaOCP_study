/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day03_javaString;

/**
 *
 * @author user
 */
public class StringDemo3_JavaString11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1="Java Spring Framework.\nMy name is Hank.";
        str1.lines().forEach(System.out::println);
        String str2="";
        System.out.println("isEmpty(): "+str2.isEmpty());
        System.out.println("isBlank(): "+str2.isBlank());
        String str3="       ";
        System.out.println("isEmpty(): "+str3.isEmpty());
        System.out.println("isBlank(): "+str3.isBlank());
        String str4="Java";
        str4.repeat(5);
        System.out.println("repeat1:"+str4);
        System.out.println("repeat2:"+str4.repeat(5));
        String str5=" Java ";//????
        System.out.println("trim :"+str5.trim());           
        System.out.println("strip :"+str5.strip());
        String str6="\tJava ";//???
        System.out.println("trim :"+str6.trim());           
        System.out.println("strip :"+str6.strip());
    }
    
}
