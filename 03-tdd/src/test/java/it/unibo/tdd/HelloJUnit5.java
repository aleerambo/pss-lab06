package it.unibo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;

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
            if (String.valueOf(i).contains("3") && String.valueOf(i).contains("5")) {
                assertEquals("FizzBuzz", arrayFizzBuzz.getValue(i));
            }
            else if(String.valueOf(i).contains("3")) {
                assertEquals("Fizz", arrayFizzBuzz.getValue(i));
            }
            else if(String.valueOf(i).contains("5")) {
                assertEquals("Fizz", arrayFizzBuzz.getValue(i));
            }
            else if (i % 3 == 0 && i % 5 == 0) {
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

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", arrayFizzBuzz.getValue(15));
        assertEquals("FizzBuzz", arrayFizzBuzz.getValue(30));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", arrayFizzBuzz.getValue(3));
        assertEquals("Fizz", arrayFizzBuzz.getValue(99));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", arrayFizzBuzz.getValue(5));
        assertEquals("Buzz", arrayFizzBuzz.getValue(100));
    }

    @Test
    public void number() {
        assertEquals(String.valueOf(1), arrayFizzBuzz.getValue(1));
        assertEquals(String.valueOf(2), arrayFizzBuzz.getValue(2));
    }
}
