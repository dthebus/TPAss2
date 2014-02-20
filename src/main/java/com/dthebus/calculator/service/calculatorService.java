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
public interface calculatorService {
    int add(int a, int b);
    double adddouble(double a, double b);
    boolean isequals(int a, int b);
    boolean istrue(int a, boolean b);
    boolean isfalse(int a, boolean b);
    String isnull(String a);
    String isntnull(String a);
}
