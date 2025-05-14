package com.practice.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithOne {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println(getNumbersStartingWithOne(myList));

        int[] numbers = {10, 15, 8, 49, 25, 98, 32};
        List<String> collect = Arrays.stream(numbers).boxed()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1"))
                .toList();
        System.out.println(collect);
    }

    public static List<String> getNumbersStartingWithOne(List<Integer> myList) {
        return myList
                .stream()
                .map(String::valueOf)
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());
    }
}
