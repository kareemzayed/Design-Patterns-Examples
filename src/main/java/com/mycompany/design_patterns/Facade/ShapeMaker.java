/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Facade;

/**
 *
 * @author Kareem Zayed
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void draw_circle() {
        circle.draw();
    }
    public void draw_rectangle() {
        rectangle.draw();
    }
    public void draw_square() {
        square.draw();
    }
    
}
