package com.practice.programs;

import java.util.ArrayList;
import java.util.Collections;

public class Manager26 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new F(9, 5));
        list.add(new F(8, 6));
        list.add(new F(5, 2));
        list.add(new F(4, 9));
        list.add(new F(2, 1));
        //System.out.println(list);
        Collections.sort(list, new G());
        System.out.println(list);

        Collections.sort(list, new H());
        System.out.println(list);
    }


}
