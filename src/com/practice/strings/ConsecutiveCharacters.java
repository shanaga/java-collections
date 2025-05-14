package com.practice.strings;

public class ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println("Length is : " + maxPower("leetcode"));
    }

    static int maxPower(String s) {

        int currentLen = 1;
        int maxLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 1;
            }
        }
        return  maxLen;
    }
}
