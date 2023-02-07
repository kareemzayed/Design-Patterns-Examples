/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class T3mya extends SandwachDecorator{
    public T3mya(Sandwach sw) {
        super(sw);
    }
    @Override
    public String description() {
        return super.description() + " ,T3mya";
    }

    @Override
    public double Cost() {
        return super.Cost() + 5;
    }
    
}
