package com.ok.javainoneproject.oops;

public class DefaultMethods {

    public static void main(String[] args) {

        Vehicle vehicle = new Car1();

        vehicle.start();
        vehicle.showMessage();
    }
}

interface Vehicle {

    // Abstract method
    void start();

    // Default method
    default void showMessage() {
        System.out.println("Vehicle is ready to start");
    }
}

class Car1 implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }
}