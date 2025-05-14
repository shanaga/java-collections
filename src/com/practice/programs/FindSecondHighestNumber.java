package com.practice.programs;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        // Find second highest number

        Integer integer = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(integer);

        // Find second lowest number
        Integer integer1 = Arrays.stream(numbers).boxed()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(integer1);

    }
}
