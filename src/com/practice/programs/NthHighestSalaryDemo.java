package com.practice.programs;//package com.shanaga.programs;
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class NthHighestSalaryDemo {
//    public static void main(String[] args) {
//
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Charlie", 10000);
//        map.put("Rocky", 80000);
//        map.put("Charlotte", 90000); // output
//        map.put("Carroll", 12000);
//        map.put("Augustine", 30000);
//        map.put("Ryan", 27000);
//        map.put("Bridge", 89000);
//        map.put("Ruui", 89000);
//        map.put("Noob", 89000);
//        map.put("Marshall", 67000);
//        map.put("Ronnie", 67000);
//
//        Map.Entry<String, Integer> result = getNthHighestSalaryDesc(1, map);
//        System.out.println(result);
//
//
//        map
//                .entrySet()
//                .stream()
//                .collect(Collectors
//                        .groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
//                .entrySet()
//                .stream()
//                .sorted
//
//
//    }
//
//    /*
//     * Find Nth highest salary in reverse order
//     */
//    public static Map.Entry<String, Integer> getNthHighestSalaryDesc(int number, Map<String, Integer> map) {
//        return map
//                .entrySet()
//                .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .toList()
//                .get(number);
//    }
//
//    /*
//     * Find Nth highest salary in ascending order
//     */
//    public static Map.Entry<String, Integer> getNthHighestSalaryAsc(int number, Map<String, Integer> map) {
//        return map
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .toList()
//                .get(number);
//    }
//}
