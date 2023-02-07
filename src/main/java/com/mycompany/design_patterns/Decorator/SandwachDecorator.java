/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class SandwachDecorator implements Sandwach{
    private Sandwach sw;
    
    public SandwachDecorator(Sandwach sw) {
        this.sw = sw;
    }
    @Override
    public String description() {
        return this.sw.description();
    }

    @Override
    public double Cost() {
        return this.sw.Cost();
    }
    
}
