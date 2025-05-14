package com.practice.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(71, 18, 42, 71, 67, 42, 71, 14, 71, 87);
        System.out.println(inputList.stream().distinct().collect(Collectors.toList()));

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        System.out.println(listOfStrings.stream().distinct().collect(Collectors.toList()));
    }
}
