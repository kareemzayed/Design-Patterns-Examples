/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Bridge;

/**
 *
 * @author Kareem Zayed
 */
public abstract class Shape {
    Color co;
    
    public Shape(Color co) {
        this.co = co;
    }
    abstract void colorIt();
}
