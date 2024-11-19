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
    public void charactersLengthTest() {
        assertFalse(PasswordValidator.checkLength("Short"));
        assertTrue(PasswordValidator.checkLength("VeryLongPassword"));
    }

    @Test
    public void containsACapitlLetter() {
        assertFalse(PasswordValidator.checkUpperLetter("lower"));
        assertTrue(PasswordValidator.checkUpperLetter("Upper"));
    }
    
    @Test
    public void containsALowerLetter() {
        assertFalse(PasswordValidator.checkLowerLetter("UPPERALL"));
        assertTrue(PasswordValidator.checkLowerLetter("ONELOWEr"));
    }
}
