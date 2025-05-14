package com.practice.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElementString {

    public static void main(String[] args) {
        String input = "Shantanu";
        // output : a=2,c=1, t=1, e=3,v=2, h=1, i=2, j=1, l=1, o=1
        // find all duplicate element from the given string
        List<String> duplicateElements = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);

    }
}
