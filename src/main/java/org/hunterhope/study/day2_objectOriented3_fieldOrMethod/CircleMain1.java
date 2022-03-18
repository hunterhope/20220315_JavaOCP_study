/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day2_objectOriented3_fieldOrMethod;

/**
 *
 * @author user
 */
public class CircleMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.caleAreaAndPrint();
        c1.setR(7.5);
        c1.caleAreaAndPrint();
        //如果使用者有無理要求,要顯示面積小數點2位...3...5...怎辦?
        //把計算結果給使用者,自己處理
        double area = c1.caleArea();
        System.out.printf("area = %.3f%n",area);
        //面積射程一個功能好嗎?
        //每次都要浪費效能計算不會變的值?
    }
    
}
