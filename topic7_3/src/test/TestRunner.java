package test;
//Maiza Falcon Rojas
//CST-239
//03/13/2024
//This coded is from Assignment Activity  Word Doc Part 3

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This class serves as the entry point for running JUnit tests.
 */
public class TestRunner {

    /**
     * Main method to execute JUnit tests.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class);
        
        // Print failures, if any
        for (Failure failure : result.getFailures()) {
            System.out.println("A JUnit test failed: " + failure.toString()); 
        }
        
        // Print overall result
        System.out.println("The JUnit Tests " + (result.wasSuccessful() ? "Passed" : "Failed" )); 
    }
}