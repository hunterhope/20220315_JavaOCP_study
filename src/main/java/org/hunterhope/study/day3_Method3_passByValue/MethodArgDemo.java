/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day3_Method3_passByValue;

/**
 *
 * @author user
 */
public class MethodArgDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder sb = new StringBuilder("Java");
        add(str);
        System.out.println(str);
        add(sb);
        System.out.println(sb);

    }

    public static void add(String str) {
        str = str + "11";
    }

    public static void add(StringBuilder sb) {
        sb.append("11");
    }

}
