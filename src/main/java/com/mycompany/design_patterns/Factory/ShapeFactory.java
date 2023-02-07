/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Factory;

/**
 *
 * @author Kareem Zayed
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if(type == null) {
            return null;
        }
        else if("Circle".equals(type)) {
            return new Circle();
        }
        else if ("Square".equals(type)) {
            return new Square();
        }
        else {
            return new Rectangle();
        }
    }
}
