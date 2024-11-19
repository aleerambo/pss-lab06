package it.unibo.tdd;

public class FizzBuzz {
    public String getValue(int i) {
        String initialString = "";
        String numberAsString = String.valueOf(i);
        boolean contains3 = numberAsString.contains("3");
        boolean contains5 = numberAsString.contains("5");

        if ( (i % 3 == 0) || (contains3) ) {
            initialString += "Fizz";
        } 
        if ( (i % 5 == 0) || (contains5) ) {
            initialString += "Buzz";
        }
        if (initialString.isEmpty()) {
            return numberAsString;
        }
        return initialString;
    }
}
