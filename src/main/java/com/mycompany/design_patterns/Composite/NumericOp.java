/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Composite;

/**
 *
 * @author Kareem Zayed
 */
public class NumericOp extends ArthemticExprission{
    int value;
    
    public NumericOp(int value) {
        this.value = value;
    }
    @Override
    public int getValue() {
        return this.value;
    }   
}
