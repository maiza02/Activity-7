package junit;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 1B

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of the two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The integer to subtract from (minuend).
     * @param b The integer to subtract (subtrahend).
     * @return The result of the subtraction.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of the two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division.
     */
    public int divide(int a, int b) {
 
        return a / b;
    }

    /**
     * Main method to demonstrate the usage of the Calculator class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Adding 1 + 2 is " + calc.add(1, 2));
        System.out.println("Subtracting 2 from 1 is " + calc.subtract(2, 1));
        System.out.println("Multiplication of 10 and 2 is " + calc.multiply(10, 2));
        System.out.println("Division of 10 by 2 is " + calc.divide(10, 2));
    }
}
