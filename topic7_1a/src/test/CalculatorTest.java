package test;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 1A


import org.junit.Assert;
import org.junit.Test;

import junit.Calculator;

/**
 * Test class for Calculator.
 */
public class CalculatorTest {

    /**
     * Test method for addition.
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.add(2, 1));
        Assert.assertEquals(7, calc.add(5, 2));
    }

    /**
     * Test method for subtraction.
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.subtract(2, 1));
        Assert.assertEquals(3, calc.subtract(5, 2));
    }

    /**
     * Test method for multiplication.
     */
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.multiply(2, 1));
        Assert.assertEquals(10, calc.multiply(5, 2));
    }

    /**
     * Test method for division.
     */
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.divide(2, 1));
        Assert.assertEquals(2, calc.divide(5, 2));
    }
}

