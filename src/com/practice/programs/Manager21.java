package com.practice.programs;

import java.util.ArrayList;

public class Manager21 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(90);
        list.add(new A(100));
        list.add(new A(200));
        System.out.println(list);
    }
}
