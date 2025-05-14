package com.practice.strings;

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        System.out.println(removeVowelsMethod1("Shantanu Agarwal"));
        System.out.println("------------------");
        System.out.println(removeVowelsMethod2("Roger Awose"));
    }

    private static String removeVowelsMethod1(String input) {
        String output = "";
        if (input.isEmpty()) {
            return "String is empty";
        }

        String s = input.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
            || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'){
               continue;
            } else {
                output += s.charAt(i);
            }
        }
        return output;
    }

    private static String removeVowelsMethod2(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }
}
