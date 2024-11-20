package it.unibo.tdd;

public class PasswordValidator {
    public static boolean checkLength(String password) {
        return password.length() > 8;
    }

    public static boolean checkUpperLetter(String password) {
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLowerLetter(String password) {
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNumber(String password) {
        for(int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkUnderscore(String password) {
        for(int i=0; i<password.length(); i++) {
            if (password.charAt(i) == '_') {
                return true;
            }
        }
        return false;
    }

    public static boolean check(String password) {
        if(
            checkLength(password) &&
            checkUpperLetter(password) &&
            checkLowerLetter(password) &&
            checkNumber(password) &&
            checkUnderscore(password)
        ) {
            return true;
        }
        return false;
    }
}
