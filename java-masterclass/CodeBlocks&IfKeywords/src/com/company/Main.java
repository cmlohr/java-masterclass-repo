package com.company;

public class Main {

    //Code Block and If Keyword examples
    public static void main(String[] args) {
	boolean gameOver = true;
    int score = 10000;
    int lastLevel = 3;
    int healthBar = 75;
    int staminaBar = 120;
    int happyBar = 200;
    int karma = 10;

// If statements run code based on the specific conditions.
        //uncomment the code and run to see how this works, play with the 'int score = 10000;' value to
        //see how these conditions change the output

//    if (score < 10000 && score >= 1000) {
//        int lostStamina = staminaBar - 40;
//        int lostHappy = happyBar - 100;
//        System.out.println("You did not pass on to the next round, try again?" + "\nStamina: -" + lostStamina +
//                            "\nHappy: -" + lostHappy);
//    } else if (score < 1000) {
//        int death = healthBar - 75;
//        System.out.println("Death" + "\nHealth: --" + death);
//    } else {
//        int newLevel = lastLevel + 1;
//        int newKarma = karma + 5;
//        System.out.println("Congrats, onto level " + newLevel + "!" + "\nKarma: +" + newKarma);
//    }


    // (gameOver == true) can be simplified to (gameOver)
    if(gameOver) {
        int scoreTally = score + (healthBar + staminaBar + happyBar) + (karma * 2) * lastLevel;
        System.out.println("Game Over" + "\nFinal Score: " + scoreTally);

    }
}}
