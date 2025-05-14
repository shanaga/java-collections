package com.practice.programs;

public class B implements Comparable {

    int i;
    B(int i) {
        this.i = i;
    }

    public String toString() {
        return "i = " + i;
    }


    @Override
    public int compareTo(Object o) {
        return ((B)o).i - i;
    }
}
