package it.unibo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

public class HelloJUnit5 {
    private FizzBuzz arrayFizzBuzz;

    private static final int DIMENSION = 100;

    @BeforeEach
    public void setUp() { 
        System.out.println("@BeforeEach");
        arrayFizzBuzz = new FizzBuzz();
    }

    @AfterEach
    public void tearDown() { 
        System.out.println("@AfterEach");
    }

    @Test
    public void allInOne() {
        for (int i = 1; i <= DIMENSION; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                assertEquals("FizzBuzz", arrayFizzBuzz.getValue(i));
            } 
            else if (i % 3 == 0) {
                assertEquals("Fizz", arrayFizzBuzz.getValue(i));
            } 
            else if (i % 5 == 0) {
                assertEquals("Buzz", arrayFizzBuzz.getValue(i));
            } 
            else {
                assertEquals(String.valueOf(i), arrayFizzBuzz.getValue(i));
            }
        }
    }
}
