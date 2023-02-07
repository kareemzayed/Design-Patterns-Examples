/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Prototype;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        Employee emp1 = new Employee(50, "Kareem", "Back-End", 17000, "Shopra");
        emp1.showInfo();
        
        Employee emp2 = (Employee) emp1.getClone();
        emp2.showInfo();
    }
}
