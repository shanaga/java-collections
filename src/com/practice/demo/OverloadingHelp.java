package com.practice.demo;

class OverloadingHelp {
    public static String findarea (int l, int b) {
        int var1;
        var1 = l * b;
        return String.valueOf(var1);
    }
    public static int findarea (int l, int b, int h) {
        int var2;
        var2 = l * b * h;
        return var2;
    }

    public static void main(String[] args) {
        System.out.println(findarea(3, 4));
        System.out.println(findarea(9, 9, 9));
    }
}
