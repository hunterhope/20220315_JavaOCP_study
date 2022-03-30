/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day05_oo1_Composite_組合設計;

/**
 *
 * @author user
 */
public class McDonald {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Beef beef = new Beef("碎牛肉", 10);
       Cheese cheese = new Cheese("藍紋",35);
       Bread bread = new Bread("芝麻麵包",5);
       Hamburger hamburger = new Hamburger("吉士牛肉堡",15);
       hamburger.setBread(bread);
       hamburger.setBeef(beef);
       hamburger.setCheese(cheese);
        System.out.println(hamburger);
    }
    
}
