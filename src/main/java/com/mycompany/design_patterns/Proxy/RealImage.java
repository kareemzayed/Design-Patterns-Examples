/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Proxy;

/**
 *
 * @author Kareem Zayed
 */
public class RealImage implements Image{
    private String filname;

    @Override
    public void display(String filename) {
        this.filname = filename;
        System.out.println("This is image from: " + this.filname);
    }
    
}
