/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.design_patterns.Composite;
/**
 *
 * @author Kareem Zayed
 */
public class Design_Patterns {

    public static void main(String[] args) {
      ArthemticExprission op1 = new CompositeOp(new CompositeOp(new NumericOp(6), new NumericOp(9), '*'), new NumericOp(5), '+');
        System.out.println(op1.getValue());
    }
}
