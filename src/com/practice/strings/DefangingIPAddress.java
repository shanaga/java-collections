package com.practice.strings;

public class DefangingIPAddress {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.1.0.178"));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
