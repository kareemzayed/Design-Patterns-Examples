/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Singleton;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        AccountantUser user = AccountantUser.getInstance();
        user.setFname("Ahmed");
        user.setLname("Sayed");
        user.setSalary(30.5);
        user.info();
        
        AccountantUser user2 = AccountantUser.getInstance();
        user2.info();
        
        Counter c1 = Counter.getInstance();
        c1.AddOne();
        
        Counter c2 = Counter.getInstance();
        c2.AddOne();
        
        Counter c3 = Counter.getInstance();
        c3.info();
    }
}
