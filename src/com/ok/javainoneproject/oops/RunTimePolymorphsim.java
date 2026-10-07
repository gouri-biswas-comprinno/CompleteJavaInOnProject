package com.ok.javainoneproject.oops;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphsim {

    public static void main(String[] args) {

        // Upcasting
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Runtime polymorphism
        animal1.sound();
        animal2.sound();
    }
}