package com.practice.strings;

public class ShortestPalindrome {

    // Problem solved using KMP Algorithm
    public static String shortestPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        String concat = s + "#" + reverse;
        int[] lps = new int[concat.length()];

        for (int i = 1; i < concat.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && concat.charAt(i) != concat.charAt(j)) {
                j = lps[j - 1];
            }
            if (concat.charAt(i) == concat.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        return reverse.substring(0, s.length() - lps[concat.length() - 1]) + s;
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abc"));
    }
}



