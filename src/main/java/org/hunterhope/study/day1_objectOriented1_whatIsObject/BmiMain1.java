/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day1_objectOriented1_whatIsObject;

/**
 *什麼是物件
 * @author user
 */
public class BmiMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bmi b1 = new Bmi();//物件就是一堆屬性的集合
        b1.name = "John";
        b1.height = 170;
        b1.weight = 60;

        Bmi b2 = new Bmi();
        b2.name = "Mary";
        b2.height = 150;
        b2.weight = 50;

        b1.bmi = 60 / Math.pow(170 / 100.0, 2);//這樣寫不好,如果身高或體重改了,你要修改2個地方
        System.out.printf("%s %.2f %.2f %.2f%n", b1.name, b1.height, b1.weight, b1.bmi);

        b2.bmi = b2.weight / Math.pow(b2.height / 100.0, 2);//這樣寫好
        System.out.printf("%s %.2f %.2f %.2f%n", b2.name, b2.height, b2.weight, b2.bmi);
    }

}
