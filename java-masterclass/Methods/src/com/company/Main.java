package com.company;

public class Main {

    //Method: the method in the example below is 'main'.
    public static void main(String[] args) {
        int lastLevel = 3;
        int healthBar = 75;
        int staminaBar = 120;
        int happyBar = 200;
        int karma = 10;

        int archivedScore = newScore(true, 800, lastLevel, karma, healthBar, staminaBar, happyBar);
        System.out.println(archivedScore);


//  Challenge!
// 1 Create method 'scorePosition(screenName, position) - displays player name w/position
// 2 Create method 'calcPosition(newScore)'











    }

    // Create a new method for our mock game below
    public static int newScore(boolean gameOver, int score, int lastLevel, int karma,
                               int healthBar, int staminaBar, int happyBar) {
        if (score < 10000 && score >= 1000) {
            int lostStamina = staminaBar - 40;
            int lostHappy = happyBar - 100;
            System.out.println("You did not pass on to the next round, try again?" + "\nStamina: -" + lostStamina +
                    "\nHappy: -" + lostHappy);
        } else if (score < 1000) {
            int death = healthBar - 75;
            System.out.println("Death" + "\nHealth: --" + death);
        } else {
            int newLevel = lastLevel + 1;
            int newKarma = karma + 5;
            System.out.println("Congrats, onto level " + newLevel + "!" + "\nKarma: +" + newKarma);
        }

        if (gameOver) {
            int scoreTally = score + (healthBar + staminaBar + happyBar) + (karma * 2) * lastLevel;
            System.out.println("Game Over" + "\nFinal Score: " + scoreTally);
            return scoreTally;
        } else {
            return -1;
        }
    }
}