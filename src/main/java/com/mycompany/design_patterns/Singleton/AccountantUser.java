/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Singleton;

/**
 *
 * @author Kareem Zayed
 */
public class AccountantUser {
    private String fname, lname;
    private double salary;
    private static AccountantUser instance;

    private AccountantUser(){}
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void setInstance(AccountantUser instance) {
        AccountantUser.instance = instance;
    }
    public static AccountantUser getInstance() {
        if(instance == null) {
            instance = new AccountantUser();
        }
        return instance;
    }
    public void info() {
        System.out.println("Name: " + fname + " " + lname + "\n" + "Salary: " + salary);
    }
}
