/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Flyweight;

/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
      ShapeFactory fc = new ShapeFactory();
      Shape sh = fc.getShape("circle");
      sh.draw();
    }
}
