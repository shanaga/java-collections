package com.practice.threads;

import java.util.concurrent.CompletableFuture;

public class AsynchronousExample {

    public static void main(String[] args) {
        System.out.println("Task 1 started");

        CompletableFuture.runAsync(() -> {
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
              e.printStackTrace();;
           }
           System.out.println("Task 1 completed");
        });


        System.out.println("Task 2 started");
        // Simulate a long-running task asynchronously
        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2 completed");
        });

        System.out.println("Continuing with other tasks...");

        // Keep the main thread alive for a while to allow asynchronous tasks to complete
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
