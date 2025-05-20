package com.practice.demo;

public class Test {

    public static String athleteName;
    public static double athleteSpeed;
    public static int athleteAge;

    public static void athlete() {
        int athleteAge = 0;
        System.out.println(athleteAge);

        Test t1 = new Test();
        t1.t1();
        Test t2 = new Test();
        t2.t1();
    }

    public void t1() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        athleteAge = 10;
        System.out.println(athleteAge);
        athlete();
    }

    {
        System.out.println("hello from IIB");
    }

    static {
        System.out.println("Hello from SIB");
    }


}
