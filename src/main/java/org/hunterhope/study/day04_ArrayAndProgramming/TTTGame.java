/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.hunterhope.study.day04_ArrayAndProgramming;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *利用ooxx遊戲熟悉陣列<br>
 *並且了解如何功能細化,讓程式看起來簡單明瞭<br>
 *功能細化靠方法或是物件 
 * @author user
 */
public class TTTGame {
    static String[][] ttt=new String[3][3];
    static String[] erroeMessages =new String[2];
    public static void main(String[] args) {
        start();//主程式月掃程式碼越好
    }

    public static void start() {
        //遊戲一開始,要先清空棋盤
        clear();
        print();
        //接者進入遊戲迴圈
        gameLoop();
    }

    public static void clear() {
        Arrays.stream(ttt).forEach(t->Arrays.fill(t, " "));
    }
    
    public static void print(){
        Arrays.stream(ttt).forEach(t->System.out.println(Arrays.toString(t)));
    }

    /**
     * 遊戲流程:<br>
     * 請user輸入一個位置 : 將棋盤每一個位置用一個號碼代替
     * 檢查是否有輸贏 : 有輸贏還是和局
     * 請電腦輸入一個位置
     * 檢查是否有輸贏
     */
    public static void gameLoop() {
        while (true) {            
            //請user輸入一個位置
            userDoIt();
            //檢查是否有輸贏
            if(checkWinner("o")){
                break;
            }
            //請電腦輸入一個位置
            pcDoIt();
            //檢查是否有輸贏
            if(checkWinner("x")){
                break;
            }
        }
        print();
    }

    public static void userDoIt() {
        Scanner sc=new Scanner(System.in);
        int input; 
        
        do{
            System.out.print("請user輸入一個位置(0~8): ");
          input  = sc.nextInt();//取值
          if(positionCheck(input)){//檢查
              break;
          }
          //失敗列印錯誤訊息,繼續輸入
          Arrays.stream(erroeMessages).filter(err->err!=null).forEach(err->{
              System.out.println(err);
              err=null;
          });
        }while(true);
        //運算
        ttt[input/3][input%3]="o";
        //結果
        print();        
    }
    private static boolean positionCheck(int p){
        //要在0~8之間
        if(p<0||p>=9){
            erroeMessages[0]="0~8之間,輸入錯誤: "+ p;
            return false;
        }
        boolean ok = ttt[p/3][p%3].equals(" ");
        if(!ok){
            erroeMessages[1]="此位置已有值: "+ p;
        }
        return ok;
    }

    public static boolean checkWinner(String mark) {
        String marks = mark + mark + mark;
        // 是否有贏家
        if((ttt[0][0]+ttt[0][1]+ttt[0][2]).equals(marks) || 
           (ttt[1][0]+ttt[1][1]+ttt[1][2]).equals(marks) ||
           (ttt[2][0]+ttt[2][1]+ttt[2][2]).equals(marks) ||
                
           (ttt[0][0]+ttt[1][0]+ttt[2][0]).equals(marks) ||
           (ttt[0][1]+ttt[1][1]+ttt[2][1]).equals(marks) ||
           (ttt[0][2]+ttt[1][2]+ttt[2][2]).equals(marks) ||
                
           (ttt[0][0]+ttt[1][1]+ttt[2][2]).equals(marks) ||
           (ttt[0][2]+ttt[1][1]+ttt[2][0]).equals(marks)) {
            System.out.printf("%s 贏了\n", mark.equals("o")?"User":"PC");
            return true; // 有贏家 (停止遊戲)
        }
        // 是否和局 ?
        // 有沒有找到 " " 的資料
        for(String[] row : ttt) {
            for(String value : row) {
                if(value.equals(" ")) {
                    return false; // 沒有贏家
                }
            }
        }
        System.out.println("和局");
        return true; // 和局
    }

    private static void pcDoIt() {
        Random random = new Random();
        int p;
        while (true) {            
            p = random.nextInt(9);
            if(positionCheck(p)){
                break;
            }
        }
        System.out.println("pc輸入位置:"+p);
        ttt[p/3][p%3]="x";
        erroeMessages[1]=null;
        print();
    }
    
}
