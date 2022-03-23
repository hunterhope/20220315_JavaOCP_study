/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day3_javaString;

/**
 *
 * @author user
 */
public class StringDemo2_JavaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str= "Java";
        StringBuilder sb = new StringBuilder("Java");
        //字串串接Java framework
        str = str+" framework";
        sb.append(" framework");
        System.out.println(str);
        System.out.println(sb);
        //字串串接Java Spring framework
        str = str.replace(" ", " Spring ");//只能有1個空格時,所以基本上無法插入
        sb.insert(5,"Spring ");
        System.out.println(str);
        System.out.println(sb);
        //其他String方法看API
    }
    
}
