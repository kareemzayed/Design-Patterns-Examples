/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class WithWafers extends IcecreamDecorator{
    public WithWafers(IceCream ice) {
        super(ice);
    }
    @Override
    public void make() {
        super.make();
        System.out.println("Wafers Added");
    }
}
