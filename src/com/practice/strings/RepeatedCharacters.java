package com.practice.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacters {

    public static void main(String[] args) {
        String inputString = "Wednesday";

        Map<Character, Long> charCounts = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCounts.forEach((character, count) -> {
            if (count > 1) {
                System.out.println(character + " : " + count);
            }
        });
    }
}
