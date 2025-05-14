package com.practice.programs;

public class E implements Comparable {

    int i, j;
    E (int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        return "(" + i + ", " + j + ")";
    }

    @Override
    public int compareTo(Object o) {
        return i - ((E)o).i;
    }
}
