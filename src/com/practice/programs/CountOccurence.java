package com.practice.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {

    public static void main(String[] args) {
        String input = "Shantanu";
        // output : a=2,c=1, t=1, e=3,v=2, h=1, i=2, j=1, l=1, o=1

        Map<String, Long> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
