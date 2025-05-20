package com.practice.demo;

public class Singleton {

    private int waterQuantity = 500;
    private Singleton() {

    }
    private static Singleton singleton = null;

    public int getWater(int quantity) {
        waterQuantity -= quantity;
        return quantity;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
