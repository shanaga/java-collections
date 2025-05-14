package com.practice.list;

import java.util.stream.Stream;

public class FirstTenOddNumbers {

    public static void main(String[] args) {
        for (int i = 1, count = 0; count < 10; i += 2) {
            System.out.print(i + " ");
            count++;
        }
        // Program to find first ten odd numbers
        System.out.println();


        int[] i = new int[] {1, 3};
        System.out.println(i);
        System.out.println("------------Using Java 8----------");
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1] + 2})
                .limit(10)
                .map(f -> f[0])
                .forEach(j -> System.out.print(j + " "));

    }

}
