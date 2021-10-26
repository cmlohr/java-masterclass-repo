package com.company;

public class Main {

    public static void main(String[] args) {
// Keywords
// in the example below 'double' is the key word, which is a data type that can store whole numbers from
        //1.7e-308 to 1.7e+308
    double distanceInMiles = 100d;
	double distanceInKilometers = (distanceInMiles * 1.609344d);
        System.out.println("Converted miles to kilometers = " + distanceInKilometers);

// Expressions
    int myScore = 123;  // myScore = 123 is an expression
    if (myScore != 50) { // myScore != 50 is also an expression
        System.out.println("This is an expression");  // "This is an expression" is itself an expression
    }
    }
}
