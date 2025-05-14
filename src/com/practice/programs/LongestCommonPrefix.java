package com.practice.programs;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"flower", "flight", "flowerence"};
        System.out.println(longestCommonPrefix(input));

        System.out.println(findLongestCommonPrefix(input));
    }

    // Using Java 8
    public static String findLongestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        return Arrays.stream(strings)
                .reduce((s1, s2) -> {
                    int minLength = Math.min(s1.length(), s2.length());
                    int i = 0;
                    while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                })
                .orElse("");
    }

    // without java 8
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
