package com.practice.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenNumbers {

    public static void main(String[] args) {

        // Given a list of integers, separate odd numbers and even numbers
        // Input list : [4, 6, 9, 2, 8, 1, 7]
        // Output :

        List<Integer> inputList = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        System.out.println(inputList);

        Map<Boolean, List<Integer>> oddEvenNumbersMap = inputList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        // {false=[71, 21, 67, 95, 87], true=[18, 42, 32, 14, 56]}
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();

        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("-------------");
            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            System.out.println("-------------");

            List<Integer> list = entry.getValue();
            for (int i : list) {
                System.out.println(i);
            }
        }

//        entrySet.forEach(key -> System.out.println("Odd Numbers:" + key.getKey()));
//        entrySet.forEach(value -> System.out.println("Even Numbers:" + value.getValue()));

    }
}
