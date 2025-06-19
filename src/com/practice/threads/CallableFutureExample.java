package com.practice.threads;

import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable Task
        Callable<String> callableTask = () -> {
            Thread.sleep(1000);
            return "Task completed";
        };

        Future<String> future = executorService.submit(callableTask);
        String result = future.get();
        System.out.println(result);

        executorService.shutdown();
    }
}
