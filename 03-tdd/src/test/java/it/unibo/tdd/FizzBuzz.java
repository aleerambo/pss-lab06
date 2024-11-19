package it.unibo.tdd;

public class FizzBuzz {
    public String getValue(int i) {
        if (String.valueOf(i).contains("3") && String.valueOf(i).contains("5")) {
            return "FizzBuzz";
        }
        else if(String.valueOf(i).contains("3")) {
            return "Fizz";
        }
        else if(String.valueOf(i).contains("5")) {
            return "Buzz";
        }
        else if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } 
        else if (i % 3 == 0) {
            return "Fizz";
        } 
        else if (i % 5 == 0) {
            return "Buzz";
        } 
        else {
            return String.valueOf(i);
        }
    }
}
