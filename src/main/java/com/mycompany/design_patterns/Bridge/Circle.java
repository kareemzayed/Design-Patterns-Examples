/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Bridge;

/**
 *
 * @author Kareem Zayed
 */
public class Circle extends Shape{
    public Circle(Color co) {
        super(co);
    }

    @Override
    void colorIt() {
        System.out.println("Circle");
        this.co.fileColor();
    }
}
