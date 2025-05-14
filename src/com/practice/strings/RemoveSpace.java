package com.practice.strings;

public class RemoveSpace {


    // Write a program to remove white spaces from string
    // Input = "        shantanu       "
    // Output = "shantanu"
    public static void main(String[] args) {
        String input = "      shantanu     ";
        removeWhiteSpace(input);
    }

    static void removeWhiteSpace(String input) {
        System.out.println("Input string before : " + input);
        String output = input.strip();
        System.out.println("Input String after : " + output);
    }
}
