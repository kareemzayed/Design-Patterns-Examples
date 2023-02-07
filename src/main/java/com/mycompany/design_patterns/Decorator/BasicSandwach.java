/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class BasicSandwach implements Sandwach{

    @Override
    public String description() {
        return "Bread";
    }

    @Override
    public double Cost() {
        return 10.0;
    }
    
}
