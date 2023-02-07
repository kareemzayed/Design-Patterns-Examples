/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Builder;

/**
 *
 * @author Kareem Zayed
 */
public class TeaBuilder extends StarbucksBuilder{

    @Override
    public void buildSize(String size) {
        str.setSize(size);
    }

    @Override
    public void buildDrink(String drink) {
        str.setDrink(drink);
    }
    
}
