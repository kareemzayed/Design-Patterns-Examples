/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Flyweight;

import java.util.*;

/**
 *
 * @author Kareem Zayed
 */
public class ShapeFactory {
    Shape sh;
    private static final Map<String, Shape> shape = new HashMap<>();
    public Shape getShape(String type) {
        if(shape.get(type) == null){
            switch(type){
            case "circle":
                sh = new Circle();
                break;
            case "square":
                sh = new Square();
                break;
            case "rectangle":
                sh = new Rectangle();
                break;
            default:
                return null;
            }
            shape.put(type, sh);
        }
        return shape.get(type);
    }
}
