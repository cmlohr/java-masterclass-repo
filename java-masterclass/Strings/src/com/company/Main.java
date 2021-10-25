package com.company;

public class Main {

    public static void main(String[] args) {

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        // these are the 8 primitive types in Java

        // strings are not a primitive type, a string is a sequence of characters.

        String aString = "This is a string";
        System.out.println(aString);
        aString = aString + ", and this is how you add strings together";
        System.out.println(aString);
        aString = aString + " \u00A9 2021";
        System.out.println(aString);


        //Strings are immutable you can't calculate numerical values together in strings.
        String numString = "10.55";
        numString = numString + "12.12";
        System.out.println(numString);

        String anotherString = "10";
        int thisInt = 72;
        anotherString = anotherString + thisInt;
        System.out.println("anotherString is = " + anotherString);

        double dNum = 123.45d;
        anotherString = anotherString + dNum;
        System.out.println("double example anotherString is = " + anotherString);
    }
}
