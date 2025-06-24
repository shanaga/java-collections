package com.practice.coding;

/*
☕ Problem: Repeated Coffee Orders
You are analyzing customer behavior at a coffee shop. Each customer order is represented by a single character in a string:

'E' = Espresso
'L' = Latte
'C' = Cappuccino
'M' = Mocha
'A' = Americano
You are given a string orders representing a sequence of coffee orders made throughout the day. Your task is to find all 5-order-long sequences that appear more than once in the string.

Example:
Input: orders = "ELCAMELCAMELCAME"
Output: ["ELCAM", "LCAME", "CAMEL"]

Constraints:
1 <= orders.length <= 10^5
orders contains only the characters 'E', 'L', 'C', 'M', 'A'

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoffeeOrderingService {

    public static List<String> findRepeatedOrders(String orders) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        int windowSize = 5;

        for (int i = 0; i <= orders.length() - windowSize; i++) {
            String sequence = orders.substring(i, i + windowSize);
            if (!seen.add(sequence)) {
                repeated.add(sequence);
            }
        }
        return new ArrayList<>(repeated);
    }

    public static void main(String[] args) {
        String orders = "ELCAMELCAMELCAME";
        List<String> result = findRepeatedOrders(orders);
        System.out.println("Repeated 5-order sequences: " + result);
    }

}








