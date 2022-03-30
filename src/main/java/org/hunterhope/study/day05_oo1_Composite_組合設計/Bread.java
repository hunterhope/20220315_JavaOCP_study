/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hunterhope.study.day05_oo1_Composite_組合設計;

/**
 *
 * @author user
 */
public class Bread {
    private String name;
    private Integer price;

    public Bread(String name, Integer price) {
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

    @Override
    public String toString() {
        return "Bread{" + "name=" + name + ", price=" + price + '}';
    }
    
    
}
