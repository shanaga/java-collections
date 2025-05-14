package com.practice.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveCharacter {

    public static void main(String[] args) {
        String testString = "JaAVaA GUIDES";
        char remove = 'a';
        String result = removeCharacter(testString, remove);
        System.out.println("Before String : " + testString);
        System.out.println("After String : " + result);
    }

    public static String removeCharacter(String str, char ch) {
        // Edge case check if the string is empty
        if (str == null || str.isEmpty()) {
            return str;
        }
        // Use filter to filter the passed character from method
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) != ch)
                .mapToObj(str::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
