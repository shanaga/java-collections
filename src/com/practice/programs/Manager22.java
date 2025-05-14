package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;

public class Manager22 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new B(45));
        list.add(new B(90));
        list.add(new B(12));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
