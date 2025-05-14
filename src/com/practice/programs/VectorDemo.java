package com.practice.programs;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(5);
        vector.add(10);
        vector.add(3);
        vector.add(90);
        vector.add(99);
        System.out.println(vector);

        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
