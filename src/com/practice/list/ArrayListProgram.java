package com.practice.list;

import java.util.List;

public class ArrayListProgram {

    public static void main(String[] args) {
        List<Integer> myList = new java.util.ArrayList<>();
        myList.add(45);
        myList.add(30);
        myList.add(78);

        List<Integer> myList1 = new java.util.ArrayList<>();
        myList1.add(90);
        myList1.add(8);
        myList1.add(7);
        myList1.addAll(0, myList);
        //Collections.sort(myList1);
        System.out.println(myList1);

        myList1.removeAll(myList);
        //myList1.clear();

        System.out.println(myList1);
    }
}
