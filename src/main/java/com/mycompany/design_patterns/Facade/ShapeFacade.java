/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Facade;

/**
 *
 * @author Kareem Zayed
 */
public class ShapeFacade {
    private ShapeMaker sp;
    
    public ShapeFacade() {
        sp = new ShapeMaker();
    }
    public void drawAllShapes() {
        sp.draw_circle();
        sp.draw_rectangle();
        sp.draw_square();
    }
}
