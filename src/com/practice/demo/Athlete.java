package com.practice.demo;

public class Athlete extends HumanBeing {

    public int walk(int distance, int time) {
        int speed = distance / time;
        speed = speed * 2;
        System.out.println("from Athlete walk method");
        return speed;
    }

    public static void main(String[] args) {
        HumanBeing humanBeing = new Athlete();
        int test = humanBeing.walk(100, 5);
        System.out.println(test);

        Athlete athlete = new Athlete();
        int test1 = athlete.walk(200, 5);
        System.out.println(test1);

        HumanBeing humanBeing1 = new HumanBeing();
        int test2 = humanBeing1.walk(300, 5);
        System.out.println(test2);

//        Athlete athlete1 = (Athlete) new HumanBeing();
//        int test3 = athlete1.walk(300, 5);
//        System.out.println(test3);

        final int a = 100;
    }

    public void finalize() {
        System.out.println("finalize()");
        System.gc();
    }
}
