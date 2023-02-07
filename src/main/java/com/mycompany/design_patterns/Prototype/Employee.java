/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Prototype;

/**
 *
 * @author Kareem Zayed
 */
public class Employee implements PrototypeInterface{
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;
    
    public Employee(){}
    public Employee(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.salary = salary;
    }
    public void showInfo() {
        System.out.println("Name : " + this.name + "\n" + "ID: " + this.id  + 
                "\n" + "Address: " + this.address + "\n" + "Salary: " + this.salary + "\n" + "Designation: " + this.designation);
    }
    @Override
    public PrototypeInterface getClone() {
        return new Employee(this.id, this.name, this.designation, this.salary, this.address);
    }
    
}
