/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_firstPersonAndThirdPerson;

/**
 *
 * @author user
 */
public class Account {

    String name;
    int balance;

    
    /**
     * 轉帳程序
     * 第1人稱
     */
    void transfer(int amount,Account act){
        //我提款
        withdrawal(amount);
        //對方存款
        act.diposit(amount);
    }
    /**
     * 轉帳程序 : act1 to act2
     * 第3人稱,邏輯上此方法就不屬於誰,所以要是static
     */
    static void transfer(int amount,Account act1,Account act2){
        //一方提款
        act1.withdrawal(amount);
        //一方存款
        act2.diposit(amount);
    }
    /**
     * 存款程序
     *
     * @param amount 存款金額
     */
    public void diposit(int amount) {
        if (amount <= 0) {
            System.out.println("金額不可以是負的或零");
            return;
        }
        balance += amount;
    }

    /**
     * 提款程序
     *
     * @param amount 提款金額
     */
    public void withdrawal(int amount) {
        if (amount < 0) {
            System.out.println("金額不可以是負的");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("餘額不足");
        }

    }

    /**
     * 打印程序
     */
    public void print() {
        System.out.printf("%s %d%n", name, balance);
    }
}
