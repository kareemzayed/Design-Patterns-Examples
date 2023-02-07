/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Singleton;

/**
 *
 * @author Kareem Zayed
 */
public class Counter {
    private int count = 0;
    private static Counter instance = new Counter();
    
    private Counter() {}
    public void AddOne() {
        this.count++;
    }
    public static Counter getInstance() {
        return instance;
    }
    public void info() {
        System.out.println("Count = " + count);
    }
}
