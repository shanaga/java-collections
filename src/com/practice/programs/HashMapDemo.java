package com.practice.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map map = new HashMap();
        /*map.put("abc", "e1");
        map.put("key", 200);
        map.put(500, true);
        map.put('a', true);
        System.out.println(map);
        System.out.println("-------------");

        System.out.println(map.get("key"));
        System.out.println(map.get('a'));
        System.out.println(map.get(500));

        System.out.println("-------------");*/

        map.put(null, 1000);
        map.put(null, "abc");
        map.put(null, null);
        map.put(null, "zyx");
        map.put("abc", null);
        map.put("test", "done");
        map.put(null, null);
        System.out.println(map);
    }
}
