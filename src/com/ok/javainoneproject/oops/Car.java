package com.ok.javainoneproject.oops;

public class Car {
    //make it private, so that anyone will not have the accessed to directly set or change it
    private  int speed;
    private String color;

    //Create a constructor
    public Car(String color) {
        //object ka color set krdo based on what color is passed in the parameter
        this.color = color;
    }

    //set speed using method
    public void setSpeed(int speed) {
        if(speed < 0) {
            System.out.println("Not Possible");
        } else {
            this.speed = speed;
            System.out.println("Driving at " + speed);
        }
    }

    void drive() {
        System.out.println("Driving..");
    }
}
