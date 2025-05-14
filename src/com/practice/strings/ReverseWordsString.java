package com.practice.strings;

public class ReverseWordsString {

    // Input: s = "the sky is blue"
    // Output: "blue is sky the"
    public static void main(String[] args) {
        System.out.println(reverseWords("shantanu loves shraddha"));
    }

    public static String reverseWords(String input) {
        String[] words = input.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
           reversedString.append(words[i]);
           if (i > 0) {
               reversedString.append(" ");
           }
        }

        return reversedString.toString();
    }


}
