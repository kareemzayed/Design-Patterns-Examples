/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Proxy;

/**
 *
 * @author Kareem Zayed
 */
public class RealDownload implements Download{
    private String targrtFile;

    public RealDownload(String trgetfile) {
        this.targrtFile = trgetfile;
    }
    @Override
    public void download() {
        System.out.println("Downloaded " + this.targrtFile + " File");
    }
    
}
