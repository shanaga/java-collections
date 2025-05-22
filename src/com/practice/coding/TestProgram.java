package com.practice.coding;

import java.util.*;

public class TestProgram {
    public static void main(String[] args) {


        // Input is two arraylists : l1 & l2 (ascending order already)
        // List 1 :  [1, 2, 8, 9, 10]
        // List 2 : [3, 4, 11, 12, 13]
        // TODO : Failed line : List<Integer> primaryIntegerList = Arrays.asList(1, 2, 8, 9, 10);
        List<Integer> primaryIntegerList = new ArrayList<>(Arrays.asList(1, 2, 8, 9, 10));
        //List<Integer> secondaryIntegerList = Arrays.asList(3, 4, 11, 12, 13);
        List<Integer> secondaryIntegerList =  new ArrayList<>(Arrays.asList(3, 4, 11, 12, 13));

        // List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 8, 9, 10));

        // Output is single list as l3 (maintaining the order) : L3 : [1, 2, 3, 4, 8, 9, 10, 11, 12, 13]
        primaryIntegerList.addAll(secondaryIntegerList);
        Collections.sort(primaryIntegerList);

        //primaryIntegerList.forEach(System.out.println(primaryIntegerList));
        System.out.println(primaryIntegerList);

        // HashMap<Integer, Integer>

        // Output : {1=1 , 2=2, 3=3, 4=4,8=8 and so on }

        Map<Integer, Integer> finalMap = new HashMap<>();
        for (Integer finalOutput : primaryIntegerList) {
            finalMap.put(finalOutput, finalOutput); // Key & Value
        }
        System.out.println("Final Map :" + finalMap);


        //primaryIntegerList.forEach();

        // key phases:

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using forEach loop with a lambda expression
        names.forEach(name -> System.out.println("Hello, " + name + "!"));



    }

}
