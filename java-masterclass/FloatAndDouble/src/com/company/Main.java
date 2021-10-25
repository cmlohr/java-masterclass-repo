package com.company;

public class Main {

    public static void main(String[] args) {

        // Single & Double Precision
        //Single precision = 32 bits (width)
        //Double precision = 64 bits (width)

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min Float = " + myMinFloat);
        System.out.println("Max Float = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Min Double = " + myMinDouble);
        System.out.println("Max Double = " + myMaxDouble);

        int myIntVal = 5;
        float myFloatVal = 5.25F;
        double myDoubleVal = 5.25D;
        System.out.println("myIntVal = " + myIntVal);
        System.out.println("myFloatVal = " + myFloatVal);
        System.out.println("myDoubleVal = " + myDoubleVal);

        int mySecondIntVal = 5 / 2;
        float mySecondFloatVal = 5F / 2F;
        double mySecondDoubleVal = 5D / 2D;
        System.out.println("mySecondIntVal = " + mySecondIntVal);
        System.out.println("mySecondFloatVal = " + mySecondFloatVal);
        System.out.println("mySecondDoubleVal = " + mySecondDoubleVal);

        int myThirdIntVal = 5 / 3;
        float myThirdFloatVal = 5F / 3F;
        double myThirdDoubleVal = 5D / 3D;
        System.out.println("myThirdIntVal = " + myThirdIntVal);
        System.out.println("myThirdFloatVal = " + myThirdFloatVal);
        System.out.println("myThirdDoubleVal = " + myThirdDoubleVal);
        // Note the output, double has much higher precision than the float.
        // Double is processed faster and is more precise.  Because of this Double (d) is preffered over Float and will be used for the duration of this masterclass.
    }
}