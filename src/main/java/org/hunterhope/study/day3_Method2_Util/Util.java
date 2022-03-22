/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day3_Method2_Util;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Util {

    public static double getAve(double[] values) {
        return Arrays.stream(values).average().getAsDouble();
    }

    public static double getSD(double[] values) {
        double avg = getAve(values);
        double temp = Arrays.stream(values).map(e -> Math.pow(e - avg, 2)).sum();
        return Math.sqrt(temp / values.length);
    }

    public static double getCV(double[] values) {
        //變異係數公式 https://zh.wikipedia.org/wiki/%E5%8F%98%E5%BC%82%E7%B3%BB%E6%95%B0
        return getSD(values) / getAve(values);
    }
}
