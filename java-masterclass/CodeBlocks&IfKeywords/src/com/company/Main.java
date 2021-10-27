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
}}
