package junit;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 1A

/**
 * A simple calculator class.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a The first integer (minuend).
     * @param b The second integer (subtrahend).
     * @return The result of subtracting b from a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a The numerator.
     * @param b The denominator (must be non-zero).
     * @return The result of dividing a by b.
     */
    public int divide(int a, int b) {
       
        return a / b;
    }

    /**
     * Main method for testing the Calculator class.
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
