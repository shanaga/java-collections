package com.practice.programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet<>();
        set.add(90);
        set.add(89);
        set.add(2); // Null can be added
        set.add(90); // Duplicates are avoided
        System.out.println("Size : " + set.size());
        System.out.println("-------");
        System.out.println(set);

        // Way 1
        //List<Integer> list = set.stream().collect(Collectors.toList()); // To print the set, we can also convert it into list
        //System.out.println(list);

        System.out.println("------------");
        // Way 2
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
