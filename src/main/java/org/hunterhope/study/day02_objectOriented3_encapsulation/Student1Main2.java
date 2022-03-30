/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_encapsulation;

/**
 *
 * @author user
 */
public class Student1Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setName("John");
        s1.setHeight(170);
        s1.setWeight(65);
        s1.setScore(85);
        s1.print();
        
        //我們希望使用者透過我們方法來設定屬性,但有人卻這樣用
        Student2 s2 = new Student2();
        //無法使用
//        s2.name="Mary";
//        s2.height=300;
//        s2.weight=500;
//        s2.score=750;
        s2.print();
        //為了避免我們要對屬性加以限制
    }
    
}
