package com.practice.list;

import java.util.Arrays;
import java.util.List;

public class LastElementArray {

    // Program to find out last element of array
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        System.out.println(listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get());
    }
}
