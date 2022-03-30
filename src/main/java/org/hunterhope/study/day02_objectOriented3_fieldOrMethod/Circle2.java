/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_fieldOrMethod;

/**
 *將面積變成屬性,新增一內部私有方法去計算
 * @author user
 */
public class Circle2 {

    private double r = -1;
    private double area;

    void setR(double r) {
        if (r <= 0) {
            System.out.println("半徑資料錯誤");
            return;
        }
        this.r = r;
        area = caleArea();
    }
    private double caleArea() {
        return Math.PI * Math.pow(r, 2);
    }
    
    double getArea(){
        return area;
    }
}
