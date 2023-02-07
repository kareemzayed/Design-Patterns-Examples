/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Factory;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        ShapeFactory ft = new ShapeFactory();
        Shape sp = ft.getShape("Circle");
        sp.draw();
    }
}
