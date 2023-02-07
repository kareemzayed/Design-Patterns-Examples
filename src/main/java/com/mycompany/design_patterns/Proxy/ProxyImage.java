/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Proxy;

/**
 *
 * @author Kareem Zayed
 */
public class ProxyImage implements Image{
    RealImage img = new RealImage();

    @Override
    public void display(String filename) {
        img.display(filename);
    }
    
}
