/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day2_objectOriented3_firstPersonAndThirdPerson;

/**
 *
 * @author user
 */
public class AccountMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        a1.name = "A01";
        a1.balance = 1000;
        a2.name = "A02";
        a2.balance = 1000;
        a1.transfer(300, a2);
        a1.print();
        a2.print();
        Account.transfer(500, a2, a1);
        a1.print();
        a2.print();

    }

}
