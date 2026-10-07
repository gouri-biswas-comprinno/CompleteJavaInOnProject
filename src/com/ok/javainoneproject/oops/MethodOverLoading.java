package com.ok.javainoneproject.oops;

public class MethodOverLoading {

    // 1. Different number of parameters
    static void show(int a) {
        System.out.println("One parameter: " + a);
    }

    static void show(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }


    // 2. Different type of parameters
    static void display(int value) {
        System.out.println("Integer: " + value);
    }

    static void display(String value) {
        System.out.println("String: " + value);
    }


    // 3. Different order of parameters
    static void print(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    static void print(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }


    public static void main(String[] args) {

        // Different number of parameters
        show(10);
        show(10, 20);

        // Different type of parameters
        display(100);
        display("Java");

        // Different order of parameters
        print("Gouri", 22);
        print(22, "Gouri");
    }
}
