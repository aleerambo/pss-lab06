package it.unibo.tdd;

public class FizzBuzz {
    public String getValue(int i) {
        if ( (i % 3 == 0 && i % 5 == 0) || (String.valueOf(i).contains("3") && String.valueOf(i).contains("5")) ) {
            return "FizzBuzz";
        } 
        else if ( (i % 3 == 0) || (String.valueOf(i).contains("3")) ) {
            return "Fizz";
        } 
        else if ( (i % 5 == 0) || (String.valueOf(i).contains("5")) ) {
            return "Buzz";
        } 
        else {
            return String.valueOf(i);
        }
    }
}
