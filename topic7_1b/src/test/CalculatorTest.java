package test;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 1B

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import junit.Calculator;

/**
 * Test class for the Calculator class.
 */
public class CalculatorTest {

    /**
     * Test the add method of the Calculator class.
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.add(2, 1));
        Assert.assertEquals(7, calc.add(5, 2));
    }

    /**
     * Test the subtract method of the Calculator class.
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.subtract(2, 1));
        Assert.assertEquals(3, calc.subtract(5, 2));
    }

    /**
     * Test the multiply method of the Calculator class.
     */
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.multiply(2, 1));
        Assert.assertEquals(10, calc.multiply(5, 2));
    }

    /**
     * Test the divide method of the Calculator class.
     */
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        Assert.assertEquals(2, calc.divide(2, 1));
        Assert.assertEquals(2, calc.divide(5, 2));
    }
}
