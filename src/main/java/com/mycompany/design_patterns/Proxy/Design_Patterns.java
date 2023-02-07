/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Proxy;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
        Image primg = new ProxyImage();
        primg.display("C");

        Download pr = new ProxyDownload("CD");
        pr.download();
    }
}
