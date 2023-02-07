/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Strategy;

/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
      Duck d = new MallarDuck();
      d.performFly();
      d.performQuek();
    }
}
