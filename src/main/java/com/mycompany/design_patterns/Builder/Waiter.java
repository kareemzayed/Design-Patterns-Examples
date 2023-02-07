/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Builder;

/**
 *
 * @author Kareem Zayed
 */
public class Waiter {
    private StarbucksBuilder strbuilder;
    
    public void setStarbucksBuilder(StarbucksBuilder builder) {
        strbuilder = builder;
    }
    public Starbucks getStarbucksBuilder() {
        return strbuilder.getStarbucks();
    }
    public void constructBuilder(String size, String drink) {
        strbuilder.buildSize(size);
        strbuilder.buildDrink(drink);
    }
}
