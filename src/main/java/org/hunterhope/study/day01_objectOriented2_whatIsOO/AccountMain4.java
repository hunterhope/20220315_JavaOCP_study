/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day01_objectOriented2_whatIsOO;

/**
 *為提款存款程序加上檢查
 * @author user
 */
public class AccountMain4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "A01";
        a1.balance = 0;
        
        //存款50
        a1.diposit(50);
        a1.print();
        //存款100
        a1.diposit(100);
        a1.print();
        //提款100
        a1.withdrawal(100);
        a1.print();
        //提款70
        a1.withdrawal(70);
        a1.print();
        //提款-100
        a1.withdrawal(-100);
        a1.print();
    }
    
}
