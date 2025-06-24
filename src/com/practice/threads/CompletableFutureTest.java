package com.practice.threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate delay
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            return "Hello";
        });

        // Continue the chain
        CompletableFuture<String> greeting = future.thenApply(result -> result + ", World!");

        // Blocking call to get final result
        System.out.println(greeting.get());  // Output: Hello, World!
    }
}
