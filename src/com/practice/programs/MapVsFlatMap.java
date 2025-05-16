package com.practice.programs;

import com.practice.database.AmazonDatabase;
import com.practice.model.Customer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

    public static void main(String[] args) {
        // convert list of stream from lowercase to uppercase
        List<String> collect = Stream.of("a", "b", "c", "d")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);

        // Stream to get all emails
        List<Customer> customers = AmazonDatabase.getCustomer();
        List<String> getAllEmails = customers
                .stream()
                .map(Customer::getEmail)
                .toList();

        System.out.println(getAllEmails);


        List<String> list = customers
                .stream()
                .flatMap(c -> c.getPhoneNumbers().stream())
                .toList();
        System.out.println(list);

    }
}
