package com.practice.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctCharacterCount {

    public static void main(String[] args) {
        String[] names = {"aaryanna", "aayanna", "airianna", "allannah", "anastsia", "annabella", "aaaa", "abc"};
        for (String name : names) {
            int count = countDistinctCharacters(name);
            System.out.println(name + " - " + count);
        }


        System.out.println("--------------------------");
        // Using Java 8
        String[] names1 = {"aaryanna", "aayanna", "airianna", "allannah", "anastsia", "annabella", "aaaa", "abc"};
        for (String name : names1) {
            long distinctCount = countDistinctCharacters1(name);
            System.out.println("The number of distinct characters in \"" + name + "\" is: " + distinctCount);
        }

    }


    // With Java 8
    private static long countDistinctCharacters1(String name) {
        return Arrays.stream(name.split(""))
                .distinct()
                .count();
    }



    // Without Java 8
    private static int countDistinctCharacters(String name) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : name.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

}
