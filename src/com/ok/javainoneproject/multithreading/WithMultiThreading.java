package com.ok.javainoneproject.multithreading;

public class WithMultiThreading {
    public static void main(String[] args) {
        //The class which extends thread class
        long startTime = System.currentTimeMillis();

        NumberCounter thread1 = new NumberCounter();

        //the one which implements
        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
