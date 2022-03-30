/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day01_objectOriented2_whatIsOO;

/**
 *程序導向,會造成相同邏輯,卻一直重複寫,不小心寫錯
 * @author user
 */
public class AccountMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name="A01";
        a1.balance=0;
        
        //存款50
        a1.balance +=50;
        System.out.printf("%s %d%n",a1.name,a1.balance);
        
        //存款100
        a1.balance =100;//程序導向程式會不小心相同邏輯卻寫錯了!!
        System.out.printf("%s %d%n",a1.name,a1.balance);
    }
    
}
