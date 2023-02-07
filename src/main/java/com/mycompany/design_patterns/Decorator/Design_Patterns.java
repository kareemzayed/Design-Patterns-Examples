/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Decorator;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
      Sandwach sw = new T3mya(new Fool(new BasicSandwach()));
        System.out.println("Grediants: " + sw.description() + "\n" + "Cost: " + sw.Cost());
        
        
        IceCream ice =new WithWafers(new WithNuts(new WithFruits(new SimpleIceCream())));
        ice.make();
    }
}
