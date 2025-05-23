package com.practice.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {

    public static void main(String[] args) {

        Loan loan = new Loan(Arrays.asList("113456789011", "113456783011", "113456789311", "513456789011"));

        List<String> stringLoanList = new ArrayList<>();
        stringLoanList.add("113456789011");
        stringLoanList.add("913456789011");
        stringLoanList.add("113456789012");
        stringLoanList.add("113452789011");
        stringLoanList.add("513456789011");

        String searchTerm = "513456789011";

        boolean result = stringLoanList.stream().anyMatch(str -> str.indexOf(searchTerm) != -1);
        System.out.println(result);

        boolean result1 = loan.getTags().stream().anyMatch(tag -> tag.equalsIgnoreCase(searchTerm));
        System.out.println(result1);

    }

}
