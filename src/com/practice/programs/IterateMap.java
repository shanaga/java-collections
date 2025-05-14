package com.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Charlie Agarwal", "Solutions Architect");
        map.put("Shantanu Agarwal", "Senior Staff Software Engineer");

        // Method 1 : Map.keySet

        for (String key : map.keySet()) { // This method requires two operations for each entry — one to get the next key and one to look up the value with get.
            System.out.println("key : " + key + ", value : " + map.get(key));
        }

        System.out.println("----------------");
        // Method 2 : Map.Entry

        for(Map.Entry<String, String> mapEntry : map.entrySet()) { // Map.Entry stores both the key  & value  together in one class, we get them both in a single operation
            System.out.println("key : " + mapEntry.getKey() + ", value : " + mapEntry.getValue());
        }
    }
}
