package com.company;

public class Main {

    public static void main(String[] args) {
// Ints!
        // An int occupies 32 bits and has a width of 32
        int aValue = 10000;

        // Int Min/Max Values
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        // -2147483648
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        // 2147483647

        System.out.println("Broken Max Value = " + (myMaxIntValue + 1));
        // this is called overflow
        System.out.println("Broken Min Value = " + (myMinIntValue - 1));
        // this is called underflow


// Bytes!
        // Bytes occupy 8 bits, we say a byte has a width of 8
        // a bit is not directly represented in a primitive type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Min = " + myMinByteValue);
        System.out.println("Byte Max = " + myMaxByteValue);
        
// Shorts!
        // Shorts occupy 16 bits, we say a short has a width of 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Min = " + myMinShortValue);
        System.out.println("Short Max = " + myMaxShortValue);

// Longs!
        // Longs occupy 64 bits, we say a long has a width of 64
        long aLongValue = 100L;


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Min = " + myMinLongValue);
        System.out.println("Long Max = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

// Casting
        // Casting meast to treat or convert a number from one type to another.  We put the type we want the number to be in parenthesis like this:
        // (byte) (myMinByteValue/2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
        
    }
}
