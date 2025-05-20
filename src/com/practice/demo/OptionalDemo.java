package com.practice.demo;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> name = Optional.ofNullable(null); // name will be an empty Optional

        if (name.isPresent()) {
            System.out.println("Name: " + name.get()); // This won't execute because name is empty
        } else {
            System.out.println("No name provided.");
        }

        String defaultValue = name.orElse("No name"); // defaultValue will be "No name"

        name.ifPresent(n -> System.out.println("Name: " + n));

    }
}
