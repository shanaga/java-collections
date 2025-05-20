package com.practice.demo;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Hi from main main");
        int counter = 1;

        while (counter <= 5) {
            System.out.println("Counter : " + counter);
            counter++;
        }
        System.out.println("While Loop finished");
        int ctr = 10;

        do {
            System.out.println("CTR : " + ctr);
            ctr++;
        } while (ctr <= 20);
        System.out.println("Do-while loop finished");
    }


    public static void main(int[] args){
        System.out.println("Overloaded Integer array Main Method");
    }
    public static void main(char[] args){
        System.out.println("Overloaded Character array Main Method");
    }
    public static void main(double[] args){
        System.out.println("Overloaded Double array Main Method");
    }
    public static void main(float args) {
        System.out.println("Overloaded float Main Method");
    }
}
