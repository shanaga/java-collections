package com.practice.programs;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(4);
        ListIterator listIterator = list.listIterator();

        // Iterates based on next element
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();
        System.out.println("------");

        // Iterates based on previous element
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println();
        System.out.println("------");

        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
