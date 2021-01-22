/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NiruuGopa
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        
    }
     @org.junit.jupiter.api.Test
    public void testIsEven2() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        
    }
    
     @org.junit.jupiter.api.Test
    public void testIsEven3() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(6);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testIsOdd3() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testSum() {
        System.out.println("sum");
        int n = 5;
        NumberHelper instance = new NumberHelper(3);
        int expResult = 8;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsPrime() {
        System.out.println("isPrime1");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        
    }
    
     public void testIsPrime2() {
        System.out.println("isPrime2");
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        
    }
     
     public void testIsPrime3() {
        System.out.println("isPrime3");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isDivisibleby method, of class NumberHelper.
     */
    @org.junit.jupiter.api.Test
    public void testIsDivisibleby() {
        System.out.println("isDivisibleby");
        int n = 10;
        NumberHelper instance = new NumberHelper(20);
        boolean expResult = true;
        boolean result = instance.isDivisibleby(n);
        assertEquals(expResult, result);
       
    }
    
    @org.junit.jupiter.api.Test
    public void testIsDivisibleby2() {
        System.out.println("isDivisibleby2");
        int n = 10;
        NumberHelper instance = new NumberHelper(19);
        boolean expResult = false;
        boolean result = instance.isDivisibleby(n);
        assertEquals(expResult, result);
       
    }
    
    @org.junit.jupiter.api.Test
    public void testIsDivisibleby3() {
        System.out.println("isDivisibleby");
        int n = 0;
        NumberHelper instance = new NumberHelper(20);
        boolean expResult = false;
        boolean result = instance.isDivisibleby(n);
        assertEquals(expResult, result);
       
    }
    
}
