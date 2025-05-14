package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSort {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(9);
        list.add(19);
        list.add(91);
        list.add(29);
        list.add(98);
        list.add(90);
        System.out.println(list);

        Collections.reverseOrder();

        Comparator comparator = Collections.reverseOrder();
        Collections.sort(list, comparator);

        System.out.println(list);

        System.out.println("-------------------");


    }
}
