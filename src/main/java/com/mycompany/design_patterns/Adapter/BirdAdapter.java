/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Adapter;

/**
 *
 * @author Kareem Zayed
 */
public class BirdAdapter implements ToDucky{
    private Brid bird;
    
    public BirdAdapter(Brid bird) {
        this.bird = bird;
    } 
    @Override
    public void squeak() {
        bird.makeSound();
    }
    
}
