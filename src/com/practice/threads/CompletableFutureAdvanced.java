package com.practice.threads;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAdvanced {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 20);

        // Combine two results
        CompletableFuture<Integer> combined = future1.thenCombine(future2, Integer::sum);

        // Handle result
        combined.thenAccept(result -> System.out.println("Sum: " + result))  // Output: Sum: 30
                .exceptionally(ex -> { System.out.println("Error: " + ex.getMessage()); return null; });

        // Give time to complete
        Thread.sleep(1000);
    }
}
