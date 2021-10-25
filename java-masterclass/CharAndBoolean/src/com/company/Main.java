package com.company;

public class Main {

    public static void main(String[] args) {
//Char, very basic overview
        char thisChar = 'Z';
        //chars only store a single character, they occupy 2 bytes (16bits).  This allows you to store Unicode characters.
        System.out.println(thisChar);

        char thisUnicodeChar = '\u005a';
        //this is the unicode, it prints out the same Z
        System.out.println(thisUnicodeChar);

        char tibetanChar = '\u0F12';
        System.out.println(tibetanChar);
        //use the unicode system to print out symbols or foreign language characters individually


//Boolean, basic overview
        //Logic gates such as: True, False, Yes, No, 1, 2

        boolean thisIsTrue = true;
        boolean thisIsFalse = false;
        boolean isTheSkyBlue = true;

    }
}
