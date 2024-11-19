package it.unibo.tdd;

public class FizzBuzz {
    public String getValue(int i) {
        String numberAsString = String.valueOf(i);
        boolean contains3 = numberAsString.contains("3");
        boolean contains5 = numberAsString.contains("5");

        if ( (i % 3 == 0 && i % 5 == 0) || (contains3 && contains5) ) {
            return "FizzBuzz";
        } 
        else if ( (i % 3 == 0) || (contains3) ) {
            return "Fizz";
        } 
        else if ( (i % 5 == 0) || (contains5) ) {
            return "Buzz";
        } 
        else {
            return String.valueOf(i);
        }
    }
}
