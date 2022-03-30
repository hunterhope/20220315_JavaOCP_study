/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day02_objectOriented3_encapsulation;

/**
 *
 * @author user
 */
public class Student1 {
    String name;
    double height;
    double weight;
    int score;
    
    void setName(String name){
        this.name=name;//遮蔽,所以要用this
    }
    void setHeight(double h){
        if(h<0||h>300){
            System.out.println("身高資料錯誤");
            return;
        }
        height=h;
    }
    void setWeight(double w){
        if(w<=0||w>300){
            System.out.println("體重資料錯誤");
            return;
        }
        weight=w;
    }
    void setScore(int s){
        if(s<0||s>100){
            System.out.println("分數資料錯誤");
            return;
        }
        score=s;
    }
    void print(){
        System.out.printf("name=%s height=%.1f weight=%.1f score=%d%n",
                name,height,weight,score);
    }
}
