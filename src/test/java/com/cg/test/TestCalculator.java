package com.cg.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.bean.Calculator;



/**
 * Unit test for simple App.
 */
public class TestCalculator 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_add()
    {
       Calculator calc= new Calculator();
       int res=calc.add(3, 4);
       Assert.assertEquals(7, res);
    }
    @Test
    public void test_multiply()
    {
       Calculator calc= new Calculator();
       int res=calc.multiply(3, 4);
       Assert.assertEquals(12, res);
    }
    
   
    
}
