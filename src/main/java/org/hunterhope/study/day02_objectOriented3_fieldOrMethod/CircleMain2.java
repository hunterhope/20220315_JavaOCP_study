/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_fieldOrMethod;

/**
 *
 * @author user
 */
public class CircleMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle2 c1=new Circle2();
        double r = 7.5;
        c1.setR(r);
        double area = c1.getArea();
        System.out.printf("r= %.1f area = %.3f%n",r,area);
    }
    
}
