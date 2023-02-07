/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Bridge;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        Shape sh = new Rectangle(new Red());
        sh.colorIt();
        
        
        Shape sh2 = new Circle(new Blue());
        sh2.colorIt();
    }
}
