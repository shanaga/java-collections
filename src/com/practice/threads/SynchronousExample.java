package com.practice.threads;

public class SynchronousExample {

    public static void main(String[] args) {
        System.out.println("Task 1 started");
        // Simulate a long-running task
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 1 completed");

        System.out.println("Task 2 started");
        // Simulate a long-running task
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 2 completed");
    }

}
