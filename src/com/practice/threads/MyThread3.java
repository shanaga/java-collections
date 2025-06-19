package com.practice.threads;

public class MyThread3 implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Print statement whenever run() method of this class is called
            System.out.println("Thread3");

            // Getting sleep method in try block to check for any exceptions
            try {
                // Making the thread pause for a certain time using sleep() method
                Thread.sleep(1000);
            }
            // Catch block to handle the exceptions
            catch (Exception e) {
            }
        }
    }
}
