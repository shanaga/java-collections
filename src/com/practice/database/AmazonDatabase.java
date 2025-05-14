package com.practice.database;

import com.practice.model.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazonDatabase {

    public static List<Customer> getCustomer() {
        return Stream.of(
                new Customer(101, "rock", "rock@gmail.com", Arrays.asList("571-337-0779", "571-337-0770")),
                new Customer(102, "dwayne", "dwayne@gmail.com", Arrays.asList("805-555-8888", "571-000-0770")),
                new Customer(103, "tripleH", "tripleH@gmail.com", Arrays.asList("888-337-0779", "000-337-0770")),
                new Customer(104, "kane", "kane@gmail.com", Arrays.asList("571-337-9099", "223-337-0770"))
        ).collect(Collectors.toList());
    }
}
