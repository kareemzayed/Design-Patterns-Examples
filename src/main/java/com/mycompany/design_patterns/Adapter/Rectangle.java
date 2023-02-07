/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Adapter;

/**
 *
 * @author Kareem Zayed
 */
public class Rectangle implements RecInterface{

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("X1 = " + x1 + "\n" + "X2 = " + x2 + "\n" + "Y1 = " + y1 + "\n" + "Y2 = " + y2);
    }
}
