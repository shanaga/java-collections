package com.practice.threads;

public class TestRunnableThread {
    public static void main(String[] args) {
        Runnable r1 = new MyThread3();
        Runnable r2 = new MyThread4();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
