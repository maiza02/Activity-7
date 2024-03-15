package junit;
//Maiza Falcon Rojas
//CST-239
//03/12/2024
//This coded is from Assignment Activity 7  Word Doc Part 3

/**
 * Simple calculator class.
 */
public class Calculator {
    
    /**
     * Adds two integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Sum of a and b.
     */
    public int add(int a, int b) {
        
        return a + b;
    }
    
    /**
     * Subtracts two integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Difference of a and b.
     */
    public int subtract(int a, int b) {
        
        return a - b;
    }
    
    /**
     * Multiplies two integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Product of a and b.
     */
    public int multiply(int a, int b) {
        
        return a * b;
    }
    
    /**
     * Divides two integers.
     * @param a First integer.
     * @param b Second integer.
     * @return Division of a by b.
     */
    public int divide(int a, int b) {
        
        return a / b;
    }

    /**
     * Main method to demonstrate calculator functionality.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println("Adding 1 + 2 is " + calc.add(1, 2));
        System.out.println("Subtracting 2 from 1 is " + calc.subtract(2, 1));
        System.out.println("Multiplication of 10 and 2 is " + calc.multiply(10, 2));
        System.out.println("Division of 10 by 2 is " + calc.divide(10, 2));

    }

}
