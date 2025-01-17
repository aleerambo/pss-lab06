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
    public void allInOne() {
        assertFalse(PasswordValidator.check("badpsw"));
        assertTrue(PasswordValidator.check("_AG00dPsw_"));
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

    @Test
    public void containsANumber() {
        assertFalse(PasswordValidator.checkNumber("thereIsNoNumber"));
        assertTrue(PasswordValidator.checkNumber("1Number"));
    }

    @Test
    public void containsAnUnderscore() {
        assertFalse(PasswordValidator.checkUnderscore("thereIsNoUnderscore"));
        assertTrue(PasswordValidator.checkUnderscore("Underscore_"));
    }
}
