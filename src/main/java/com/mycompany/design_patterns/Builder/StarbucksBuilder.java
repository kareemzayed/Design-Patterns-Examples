/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Builder;

/**
 *
 * @author Kareem Zayed
 */
public abstract class StarbucksBuilder {
    Starbucks str = new Starbucks();
    
    public Starbucks getStarbucks() {
        return str;
    }
    public abstract void buildSize(String size);
    public abstract void buildDrink(String drink);
}
