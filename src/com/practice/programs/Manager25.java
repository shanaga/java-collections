package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;

public class Manager25 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new E(9, 5));
        list.add(new E(8, 6));
        list.add(new E(5, 2));
        list.add(new E(4, 9));
        list.add(new E(2, 1));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
