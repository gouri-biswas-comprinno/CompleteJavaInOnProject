package com.ok.javainoneproject.multithreading;

public class SumCalculator implements Runnable {
    @Override
    public void run() {
        long sum =0;
        for(int i = 1;i<= 10000000;i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

    }
}
