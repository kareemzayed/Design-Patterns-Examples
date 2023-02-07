/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class Fool extends SandwachDecorator{
    
    public Fool(Sandwach sw) {
        super(sw);
    }
    
    @Override
    public String description() {
        return super.description() + " ,Fool";
    }

    @Override
    public double Cost() {
        return super.Cost() + 0.5;
    }
}
