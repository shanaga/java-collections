package com.practice.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        // Input : List of colors (duplicate) ["Green", "Blue", "Red", "Blue", "Green", "Orange", "Red"]
        // Output : HashMap = {Green=2, Blue=2, Red=2, Orange=1}

        List<String> input = new ArrayList<>(Arrays.asList("Green", "Blue", "Red", "Blue", "Green", "Orange", "Red"));
        List<String> input1 = new ArrayList<>(Arrays.asList("White", "Blue", "Red", "Blue", "White", "Orange", "White"));
        System.out.println(input);

        // Output : Key=value; Color=No.of Occurrences
        Map<String, Long> outputMap = input.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x -> x , Collectors.counting()));
        System.out.println(outputMap);

        Map<String, Long> anotherMap = input1.stream().map(String::toLowerCase).collect(Collectors.groupingBy(x -> x , Collectors.counting()));
        System.out.println(anotherMap);


        System.out.println("*******************");

        int[] inputTestArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Find the indexes of the combination array
        f1(inputTestArray, 15);
    }

    // function with input as Int array (10), Number(15) : public static void f1(array, number)
    // Find two numbers from integer array who sum is equal to 15, then print the indexes of those two numbers.

    public static void f1(int[] input, int number) {
        HashMap<Integer, Integer> testMap = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            // keep a placeholder
            int placeholder = number - input[i]; // 15 - 1 = 14,1 ; 15 - 2 = 13,2
            System.out.println(placeholder);// // 15 - input[0] = 15 - 1 = 14
            if (testMap.containsKey(placeholder)) {
                System.out.println(testMap.get(placeholder)  + " : " + i);
                return;
            }

        }
    }

}
