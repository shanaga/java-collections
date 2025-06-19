package com.practice.demo;

import java.util.*;

public class TestProgram {
    public static void main(String[] args) {
        List<Integer> primaryIntegerList = new ArrayList<>(Arrays.asList(1, 2, 8, 9, 10));
        List<Integer> secondaryIntegerList =  new ArrayList<>(Arrays.asList(3, 4, 11, 12, 13));
        primaryIntegerList.addAll(secondaryIntegerList);
        Collections.sort(primaryIntegerList);
        System.out.println(primaryIntegerList);

        Map<Integer, Integer> finalMap = new HashMap<>();
        for (Integer finalOutput : primaryIntegerList) {
            finalMap.put(finalOutput, finalOutput); // Key & Value
        }
        System.out.println("Final Map :" + finalMap);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using forEach loop with a lambda expression
        names.forEach(name -> System.out.println("Hello, " + name + "!"));
    }

}
