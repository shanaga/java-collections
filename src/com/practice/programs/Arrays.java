package com.practice.programs;

public class Arrays {
    public static void main(String[] args) {
        // All are valid declarations
        int[] x = new int[3];
        int []y = new int[1];
        int[] z = new int[0];
        int[]p = new int[4];
        int q[] = new int[]{10, 20};
        int s[] = {1, 2, 3, 4};

        x[0] = 3;
        x[1] = 1;
        x[2] = 3;
        System.out.println(x[1]);

        System.out.println("*----------------");

        int[] array;
        array = new int[4];
        System.out.println(array[0]); // This will print zeo - 0, since value isn't assigned

        array[0] = 5;
        System.out.println(array[0]);// Prints 5

        System.out.println(array.length);

        System.out.println("*----------------");

        int a[] = {30, 42, 8, 1, 4, 90, 7};
        java.util.Arrays.stream(a).sorted().forEach(System.out::println);

        System.out.println("*----------------");
        java.util.Arrays.sort(a);
        System.out.println(java.util.Arrays.toString(a));

        System.out.println("*----------------");
        

    }
}