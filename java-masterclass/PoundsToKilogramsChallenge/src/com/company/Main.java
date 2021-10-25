package com.company;

public class Main {

    public static void main(String[] args) {
	// create a pounds to kilograms converter
        // 1 set your variable to store the value of 'pounds'
        // 2 calculate the results and store the results in another variable
        // 3 print the results

        //change the mass
        double massInLBS = 150D;
        double conversion = 0.45359237D;
        double convertedKilograms = (massInLBS * conversion);
        System.out.println("Converted LBS to kilograms = " + convertedKilograms);

    //extra exercizes
        double pi = 3.1415927d;
        System.out.println(pi);

        double newNum = 2_000_000.4_567_899d;
        System.out.println(newNum);
        // underscores are for human convention only, they are ignored by the computer.
    }
}
