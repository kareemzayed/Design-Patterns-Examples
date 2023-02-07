/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.design_patterns.Composite;
/**
 *
 * @author Kareem Zayed
 */
public class CompositeOp extends ArthemticExprission{
    ArthemticExprission op1;
    ArthemticExprission op2;
    char op;

    public CompositeOp(ArthemticExprission op1, ArthemticExprission op2, char op){
        this.op = op;
        this.op1 = op1;
        this.op2 = op2;
    }
    @Override
    public int getValue() {
        switch(op){
            case '+':
                return (op1.getValue()+op2.getValue());
            case '-':
                return (op1.getValue()-op2.getValue());
            case '*':
                return (op1.getValue()*op2.getValue());
            case '/':
                return (op1.getValue()/op2.getValue());
            default:
                return 0;
        }
    }
    
}
