/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.calculator.service;

/**
 *
 * @author student
 */
public class CalculatorImpl implements calculatorService{

    public int add(int a, int b) {
        return a+ b; //To change body of generated methods, choose Tools | Templates.
    }
    
    public double adddouble(double a, double b) {
        return a+ b; //To change body of generated methods, choose Tools | Templates.
    }
   

    public boolean isequals(int a, int b) {
       return(a==b); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean istrue(int a, boolean b)
    {
        if(a > 10)
            return true;
        else
            return false;
        
        
    
    }
    
    public boolean isfalse(int a, boolean b)
    {
        if(a> 10)
            b= true;
        else
            b= false;
        
        return b;
    
    }
    public String isnull(String a)
    {
    return a;
    }
    public String isntnull(String a)
    {
    return a;
    }
}
