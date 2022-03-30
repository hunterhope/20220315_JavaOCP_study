/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day04_modernProgramming;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * for迴圈少用,容易寫錯index<br>
 * 多加利用Stream API
 * @author user
 */
public class StatisticsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {90, 100, 80};
        // 最小, 最大, 平均, 總和, 個數
        // 將 scores 串流化
        Arrays.stream(scores).forEach(x -> System.out.println(x));
        
        int sum = IntStream.of(scores).sum();
        System.out.println(sum);
        
        double avg = IntStream.of(scores).average().getAsDouble();
        System.out.println(avg);
        
        int max = IntStream.of(scores).max().getAsInt();
        System.out.println(max);
        
        IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getAverage());
        System.out.println(stat.getSum());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
        System.out.println(stat.getCount());
    }
    
}
