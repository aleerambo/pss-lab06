package it.unibo.tdd;

public class PasswordValidator {
    public static boolean checkLength(String password) {
        return password.length() > 8;
    }
}
