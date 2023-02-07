/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Decorator;

/**
 *
 * @author Kareem Zayed
 */
public class IcecreamDecorator implements IceCream{
    private IceCream ice;
    

    public IcecreamDecorator( IceCream ice) {
        this.ice = ice;
    }
    @Override
    public void make() {
        this.ice.make();
    }
    
}
