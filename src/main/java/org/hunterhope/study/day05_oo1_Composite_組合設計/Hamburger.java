/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day05_oo1_Composite_組合設計;

/**
 *此類別就是組合設計
 * 使用別人的物件要記得檢查null
 * @author user
 */
public class Hamburger {
    private String name;
    private Integer price;
    private Bread bread;
    private Beef beef;
    private Cheese cheese;

    public Hamburger(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
        if(bread!=null){
            price+=bread.getPrice();
        }
    }

    public Beef getBeef() {
        return beef;
    }

    public void setBeef(Beef beef) {
        this.beef = beef;
        if(beef!=null){
            price+=beef.getPrice();
        }
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
         if(cheese!=null){
            price+=cheese.getPrice();
        }
    }

    @Override
    public String toString() {
        return "Hamburger{" + "name=" + name + ", price=" + price + '}';
    }

    
    
    
}
