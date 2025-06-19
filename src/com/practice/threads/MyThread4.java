package com.practice.threads;

public class MyThread4 implements Runnable {
    // run() method inside this class
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread4 ");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
        }
    }
}
