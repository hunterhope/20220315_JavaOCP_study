/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day03_Method1_reduceComplex;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class 標準差與變異係數 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 公式上網查 https://zh.wikipedia.org/wiki/%E6%A8%99%E6%BA%96%E5%B7%AE
        double[] height = {170, 150, 185, 168};
        double[] weight = {70, 50, 55, 87};
        //公式很複雜,但可以將其拆解,一部分一部分算
        //先算平均
        double hAvg=getAve(height);
        double wAvg=getAve(weight);
        System.out.printf("hAvg=%.2f wAvg=%.2f%n",hAvg,wAvg);
        System.out.printf("hSD=%.2f wSD=%.2f%n",getSD(height),getSD(weight));
        System.out.printf("hCV=%.2f wCV=%.2f%n",getCV(height),getCV(weight));
    }
    
    public static double getAve(double[] values){
        return Arrays.stream(values).average().getAsDouble();
    }
    
    public static double getSD(double[] values){
        double avg = getAve(values);
        double temp = Arrays.stream(values).map(e->Math.pow(e-avg,2)).sum();
        return Math.sqrt(temp/values.length);
    }
    
    public static double getCV(double[] values){
        //變異係數公式 https://zh.wikipedia.org/wiki/%E5%8F%98%E5%BC%82%E7%B3%BB%E6%95%B0
        return getSD(values)/getAve(values);
    }
    
}
