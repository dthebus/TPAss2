/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dthebus.calculator;

import com.dthebus.calculator.service.CalculatorImpl;
import com.dthebus.calculator.service.calculatorService;
import org.junit.Ignore;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class calculatorTest {
    public static calculatorService service;
    public calculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() { Assert.assertEquals(service.add(2, 4),6);}
     @Test
     public void adddouble(){Assert.assertEquals(service.adddouble(2.4, 3.2),5.6);}
     @Test
     public void isequals(){Assert.assertSame(service.isequals(3,3), true);}
     @Test
     public void istrue(){Assert.assertTrue(service.istrue(11, true));}
     @Test
     public void isfalse(){Assert.assertFalse(service.isfalse(4, false));}
     @Test
     public void isnull(){Assert.assertNull(service.isnull(null));}
     @Test
     public void isntnull(){Assert.assertNotNull(service.isnull("Hello"));}
     @Ignore
     public void fail(){}
     @Test
     public void assertmsg(){Assert.assertEquals(service.add(2, 4),6,"Assert message passed");}
     @Test 
     public void arrayStuff(){
         String[] arr1 = new String[] {"dog", "cat","rat"};
         String[] arr2 = new String[] {"dog", "cat","rat"};
         assertEquals(arr1, arr2);
     }
     @Test(expectedExceptions = ArithmeticException.class)
     public void testEx(){
        int a= 7/0;
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        service = new CalculatorImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
