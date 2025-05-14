package com.practice.strings;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FindRepeatingCharacters {
    public static void main(String[] args) {
        // Find the First Repeating Character in a String
        String input = "abca";
        Character output = findRepeatingCharacters(input);

        if (output != null) {
            System.out.println("Repeating Characters : " + output);
        } else {
            System.out.println("No repeating characters found");
        }
    }

    public static Character findRepeatingCharacters(String str) {
        Set<Character> usedCharacters = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (usedCharacters.contains(c)) {
                return c;
            }
            usedCharacters.add(c);
        }
       return null;
    }
}