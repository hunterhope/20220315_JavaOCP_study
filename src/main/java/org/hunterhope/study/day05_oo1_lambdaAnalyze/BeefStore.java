/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day05_oo1_lambdaAnalyze;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * 以後寫成是少用基本迴圈分析 要用Java 8 Stream
 *
 * @author user
 */
public class BeefStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beef b1 = new Beef("碎牛肉", 10);
        Beef b2 = new Beef("肋眼牛排", 50);
        Beef b3 = new Beef("牛小排", 30);
        Beef b4 = new Beef("菲力牛排", 60);
        Beef b5 = new Beef("組合牛", 12);
        Beef[] beefs = {b1, b2, b3, b4, b5};
        int max = Arrays.stream(beefs).mapToInt(Beef::getPrice).max().getAsInt();
        System.out.printf("最貴的牛肉價錢 : %d%n",max);
        Arrays.stream(beefs).filter(beef-> beef.getPrice()==max).forEach(beef->{
            System.out.printf("最貴的牛肉 : %s%n",beef.getName());
        });
        //牛排平均價格
        OptionalDouble opt = Arrays.stream(beefs).filter(beef->beef.getName().contains("排"))
                .mapToInt(Beef::getPrice).average();
        if(opt.isPresent()){
            System.out.printf("牛排平均價格 : %.2f%n",opt.getAsDouble());
        }else{
            System.out.println("沒有販售牛排");
        }
    }

}
