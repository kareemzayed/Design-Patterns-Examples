/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Proxy;

/**
 *
 * @author Kareem Zayed
 */
public class ProxyDownload implements Download{
    private String file;
    private RealDownload rl;
    
    public ProxyDownload(String file) {
        this.file = file;
        rl = new RealDownload(this.file);
    }
    @Override
    public void download() {
        rl.download();
    }
    
}
