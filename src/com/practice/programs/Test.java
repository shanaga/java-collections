package com.practice.programs;

import java.util.ArrayList;
import java.util.List;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;

class Test {
    public static void main(String[] args ) throws Exception {
//        StringBuilder inputData = new StringBuilder();
//        String thisLine = null;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while ((thisLine = br.readLine()) != null) {
//            inputData.append(thisLine + "\n");
//        }
        //System.out.println(inputData);
        // Output the solution to the console
        StringBuilder inputData = new StringBuilder();
        inputData.append("1123");
        //System.out.println(codeHere(inputData));

        System.out.println("1123".substring(3, 5));
    }
    public static String codeHere(StringBuilder inputData) {
        // Use this function to write your solution;
        String encodedString = inputData.toString();
        System.out.println(encodedString);
        List<String> decodedStrings = decode(encodedString);

        String result = "";

        for (String str: decodedStrings) {
            result = result + str + "\n";
        }
        return result;
    }

    public static List<String> decode(String encoded) {
        List<String> result = new ArrayList<>();
        decodeHelper(encoded, 0, "", result);
        return result;
    }

    private static void decodeHelper(String encoded, int index, String current, List<String> result) {

        if (index == encoded.length()) {
            result.add(current);
            return;
        }

        int oneDigit = Integer.parseInt(encoded.substring(index, index + 1));
        if (oneDigit >= 1 && oneDigit <= 26) {
            char ch = (char) ('a' + oneDigit - 1);
            decodeHelper(encoded, index + 1, current + ch, result);
        }

        if (index + 2 <= encoded.length()) {
            int twoDigits = Integer.parseInt(encoded.substring(index, index + 2));
            if (twoDigits >= 10 && twoDigits <= 26) {
                char ch = (char) ('a' + twoDigits - 1);
                decodeHelper(encoded, index + 2, current + ch, result);
            }
        }

    }

}
