package com.company;

public class Main {

    public static void main(String[] args) {

        int aValue = 10000;

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
        
    }
}
