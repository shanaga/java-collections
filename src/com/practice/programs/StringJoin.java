package com.practice.programs;

import java.util.Arrays;
import java.util.List;

public class StringJoin {

    public static void main(String[] args) {
       List<String> myList = Arrays.asList("1", "2", "3", "4");
       // 1-2-3-4
        String join = String.join("-", myList);
        System.out.println(join);
    }
}
