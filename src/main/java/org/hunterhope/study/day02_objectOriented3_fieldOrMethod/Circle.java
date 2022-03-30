/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_fieldOrMethod;

/**
 *
 * @author user
 */
public class Circle {

    private double r = -1;

    void setR(double r) {
        if (r <= 0) {
            System.out.println("半徑資料錯誤");
            return;
        }
        this.r = r;
    }
    void caleAreaAndPrint(){
        if(r==-1){
            System.out.println("請先設定半徑");
            return;
        }
        double area = Math.PI*Math.pow(r, 2);
        System.out.printf("r=%.1f area=%.1f%n",r,area);
    }

    double caleArea() {
        if (r == -1) {
            System.out.println("請先設定半徑");
            return 0;
        }
        return Math.PI * Math.pow(r, 2);
    }
}
