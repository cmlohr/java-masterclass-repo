package com.company;

public class Main {

    public static void main(String[] args) {
// Statements
        int thisVar = 45; // The whole line is a statement
        System.out.println(thisVar);
        thisVar++; // This is also a statement
        System.out.println(thisVar);
        thisVar--; // Also a statement
        System.out.println(thisVar);

        System.out.println("Bippity boppity boop!"); // This is a complete statement

        // statements don't have to be on one line
        System.out.println("Abra" +
                "ca" +
                "dabra!");

        // You *COULD* put statements on the same line and java still see's it as valid because the simicolon
        // separates the code.  However this is rather hard for human eyes to read.
        int varA = 123;
        thisVar--;
        System.out.println("This is also a valid statement");


    }
}
