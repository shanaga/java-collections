package com.practice.programs;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        System.out.println(getEvenNumbersList(myList));
    }

    public static List<Integer> getEvenNumbersList(List<Integer> myList) {
        return myList.stream().filter(i -> i % 2 == 0).toList();
    }
}