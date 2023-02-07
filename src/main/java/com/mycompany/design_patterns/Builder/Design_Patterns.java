/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Builder;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        Waiter wt = new Waiter();
        StarbucksBuilder builder = new TeaBuilder();
        wt.setStarbucksBuilder(builder);
        wt.constructBuilder("50", "Tea");
    }
}
