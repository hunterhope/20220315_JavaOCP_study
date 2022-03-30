/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day01_objectOriented2_whatIsOO;

/**
 *
 * @author user
 */
public class Account {

    String name;
    int balance;

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
