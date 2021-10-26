package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult); //previousResult doesn't get updated

        result = result * 10; // 2 * 10
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; // 2 - 1 = 1
        System.out.println(result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println(result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3; // 30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        // result = result - 2;
        result -= 2; // 10 - 2 = 8;
        System.out.println("10 - 2 = " + result);


// if then statements
        // AND == && The logical AND operates on boolean operands- checks if the condition is true or false
        // OR == || The logical OR operates on boolean operands- checks if the condition is true or false
        // & bitwise AND operator, working at the bit level
        // | bitwise OR operator, working at the bit level
        // ! or NOT the logical complement operator
        // ternary operator ? is used as a shortcut to assign one of two values depending on the conditions.
        boolean isCat = false;
        if (isCat == false) {
            System.out.println("This is not a cat!");
            System.out.println("Cats rule dogs drool!");
        }
        int numTacos = 100;
        if (numTacos >= 100) {
            System.out.println("You ate all the tacos!");
        }

        int numHotdogs = 50;
        if ((numTacos > numHotdogs) && (numTacos <= 100)) {
            System.out.println("I'm so full!  Both are true.");
        }

        if ((numTacos > 75) || (numHotdogs <= 32)) {
            System.out.println("That was a lot. Either or both are true.");
        }

        int newNum = 25;
        // == compares the two values.
        if (newNum == 25) {
            System.out.println("True!");
        }

        boolean isSnek = true;
        if (isSnek) {
            System.out.println("Snek is true");
        }

        boolean wasSnek = isSnek ? true : false;
        if (wasSnek) {
            System.out.println("wasSnek is true");
        }

        int numOfCats = 30;
        boolean isBoxOfCats = (numOfCats == 25) ? true : false;
        if (isBoxOfCats) {
            System.out.println("That's enough cats.");
        }
        if (numOfCats > 25) {
            System.out.println("You have too many cats!");
        }
        else System.out.println("You need moar cats!");
    }
}
