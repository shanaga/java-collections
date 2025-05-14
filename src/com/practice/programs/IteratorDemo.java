package com.practice.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(9);
        list.add(4);
        list.add(5);
        list.add(4);
        //System.out.println(list);
        //System.out.println("--------");

        Iterator it = list.iterator();
        //list.add(50); // This throws concurrent exception error


        /*while(it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }*/

        System.out.println("---------");
        // The following program will not give any output
        while(it.hasNext()) {
            System.out.println(it.next() + ",");
        }
        list.add(50);
        System.out.println(list);
    }
}
