package com.company;

public class Main {

    public static void main(String[] args) {
	// OperatorChallenge
        // create two double variables with the value of 15.00 and 40.00
        // add together the two variables and multiply by 20 to obtain a result
        // find the remainder of the result and 50
        // use a boolean to print "Remainder = " if the result is not 0
        // TIP!  In Java we refer to 'order of operations' as operator precedence.

        double varOne = 20.00d;
        double varTwo = 80.00d;

        double dResult = (varOne + varTwo) * 100.00d;
//        double dResult = varOne + varTwo * 100.00d;
            System.out.println("dResult = " + dResult);
        double myRemainder = dResult % 40.00d;

        boolean noRemainder = (myRemainder == 0) ? true : false;
            System.out.println("boolean = " + noRemainder);
        if (!noRemainder) {
            System.out.println("There is a remainder = " + myRemainder);
        }
        else System.out.println("There is no remainder.");

    }
}
