package com.practice.strings;

public class RomanToInt {
    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     **/

    public static void main(String[] args) {
        String s = "IVXLCDM";
        int ans = 0;
        int [] roman = new int[128];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        System.out.println(roman['I']);

//        for (int i = 0; i < s.length(); i++) {
//            if (roman[s.charAt(i)]) {
//
//            }
//        }
    }
}
