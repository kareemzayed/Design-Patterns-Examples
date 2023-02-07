/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Strategy;

/**
 *
 * @author Kareem Zayed
 */
public class FlyWithWings implements Flybehavior{

    @Override
    public void fly() {
        System.out.println("Fly With Wings");
    }
    
}
