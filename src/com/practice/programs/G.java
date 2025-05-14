package com.practice.programs;

import java.util.Comparator;

public class G implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        F f1 = (F) o1;
        F f2 = (F) o2;
        return f1.i - f2.i;
    }
}
