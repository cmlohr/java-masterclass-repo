package com.company;

public class Main {

    public static void main(String[] args) {
//Challenge
        //Create a byte variable and set it to any valid byte number.
        byte myByte = (byte) (100);
        System.out.println("myByte = " + myByte);

        //Create a short variable and set it to any valid short number.
        short myShort = (short) (24000);
        System.out.println("myShort = " + myShort);

        //Create an int variable and set it to any valid int number.
        int myInt = 34;
        System.out.println("myInt = " + myInt);

        //Create a variable type long and make it equal to 50000 + 10 * (myByte + myShort + myInt)
        long myLong = (long) (50000 + 10 * (myByte + myShort + myInt));
        System.out.println("myLong = " + myLong);
    }
}
