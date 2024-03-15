package test;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 3

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


import junit.Calculator;

/**
 * Test suite for Calculator class.
 */
@RunWith(Parameterized.class)
public class CalculatorTest {
    
    /**
     * Enum representing types of operations.
     */
    enum Type {ADD, SUBTRACT, MULTIPLY, DIVIDE};
    
    @Parameter(0)
    public Type type;
    @Parameter(1)
    public int a1;
    @Parameter(2)
    public int a2;
    @Parameter(3)
    public int result;
    
    /**
     * Provides test data.
     * @return Collection of test data.
     */
    @Parameters
    public static Collection<Object[]> data() {
        
        Object[][] data = new Object[][] { 
            {Type.ADD,  2 , 1, 3 }, {Type.ADD, 5, 2 , 7},
            {Type.SUBTRACT,  2 , 1, 1 }, {Type.SUBTRACT, 5, 2 , 3},
            {Type.MULTIPLY,  2 , 1, 2 }, {Type.MULTIPLY, 5, 2 , 10},
            {Type.DIVIDE,  2 , 1, 2 }, {Type.DIVIDE, 5, 2 , 2}
            };
            return Arrays.asList(data);
            }


    /**
     * Test addition.
     */
    @Test
    public void testAdd() {
        Assume.assumeTrue(type == Type.ADD);
        Calculator calc = new Calculator();
        Assert.assertEquals(result, calc.add(a1, a2));
    }

    /**
     * Test subtraction.
     */
    @Test
    public void testSubtract() {
        Assume.assumeTrue(type == Type.SUBTRACT);
        Calculator calc = new Calculator();
        Assert.assertEquals(result, calc.subtract(a1, a2));
    }

    /**
     * Test multiplication.
     */
    @Test
    public void testMultiply() {
        Assume.assumeTrue(type == Type.MULTIPLY);
        Calculator calc = new Calculator();
        Assert.assertEquals(result, calc.multiply(a1, a2));    
    }

    /**
     * Test division.
     */
    @Test
    public void testDivide() {
        Assume.assumeTrue(type == Type.DIVIDE);
        Calculator calc = new Calculator();
        Assert.assertEquals(result, calc.divide(a1, a2));

    }
  
}