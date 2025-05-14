package com.practice.strings;

public class Palindrome2 {
    public static void main(String[] args) {
        String input = "gadaeg";
        if (isPalindrome(input)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    static boolean isPalindrome(String s){
        for (int i = 0 ; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
