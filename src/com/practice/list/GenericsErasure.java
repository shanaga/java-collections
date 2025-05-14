package com.practice.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsErasure {

    public GenericsErasure() {

    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String s;
        for (Iterator iter = list.iterator(); iter.hasNext();
             System.out.println(s))
            s = (String)iter.next();
        }

}
