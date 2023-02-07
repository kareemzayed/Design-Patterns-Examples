/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Strategy;

/**
 *
 * @author Kareem Zayed
 */
public class MallarDuck extends Duck{
    public MallarDuck() {
        fb = new FlyWithWings();
        qb = new Quek();
    }
    
    public void display() {
        System.out.println("I am MallerDuck !");
    }
}
