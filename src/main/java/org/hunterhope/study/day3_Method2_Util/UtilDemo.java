/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day3_Method2_Util;

import static org.hunterhope.study.day3_Method2_Util.Util.getCV;

/**
 *
 * @author user
 */
public class UtilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] height = {170, 150, 185, 168};
        double[] weight = {70, 50, 55, 87};
        System.out.printf("hAvg=%.2f wAvg=%.2f%n",Util.getAve(height),Util.getAve(weight));
        System.out.printf("hSD=%.2f wSD=%.2f%n",Util.getSD(height),Util.getSD(weight));
        System.out.printf("hCV=%.2f wCV=%.2f%n",Util.getCV(height),Util.getCV(weight));
        //static import
        System.out.printf("hCV=%.2f wCV=%.2f%n",getCV(height),getCV(weight));
        
    }

}
