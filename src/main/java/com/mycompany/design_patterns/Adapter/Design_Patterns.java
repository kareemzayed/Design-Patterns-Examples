/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Adapter;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
      int x1 = 5;      int y1 = 3;
      int x2 = 6;      int y2 = 25;
       
      RecInterface shape = new RecAdapter(new LegecyRec());
      shape.draw(x1, y1, x2, y2);
       
      Sparrow sp = new Sparrow();
      ToDucky duck = new PlasticToyDuck();
      BirdAdapter ad = new BirdAdapter(sp);
      System.out.println("Sparrow...");
      sp.fly();
      sp.makeSound();
      System.out.println("ToDucky....");
      duck.squeak();
      System.out.println("BirdAdapter....");
      ad.squeak();
    }
}
