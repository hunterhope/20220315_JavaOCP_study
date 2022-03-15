/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day1_objectOriented_whatIsOO;

/**
 * 利用物件導向存款
 *
 * @author user
 */
public class AccountMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "A01";
        a1.balance = 0;

        //存款50
        a1.diposit(50);
        System.out.printf("%s %d%n", a1.name, a1.balance);

        //存款100
        a1.diposit(100);
        System.out.printf("%s %d%n", a1.name, a1.balance);//每次存款都要看結果,也可以物件導向
        //提款也該寫成物件導向
    }

}
