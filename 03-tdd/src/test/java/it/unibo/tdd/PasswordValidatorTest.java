package it.unibo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @BeforeEach
    public void setUp() { 
        System.out.println("@BeforeEach");
    }

    @Test
    public void simpleTest() {
        assertFalse(PasswordValidator.checkLength("Short"));
    }
}
