package com.practice.strings;

import java.util.Arrays;

public class Anagram {

    // Write a program to check if two strings are anagram or not.
    // Input : String 1 : Listen, String 2 : Silent
    // Output : True
    public static void main(String[] args) {
        boolean output = areAnagram("secure", "rescue");
        System.out.println(output);
    }

    static boolean areAnagram(String input1, String input2) {
        char [] char1 = input1.toCharArray();
        char [] char2 = input2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

}
