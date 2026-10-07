package com.ok.javainoneproject.oops;

public class Abstraction {

    public static void main(String[] args) {

        //Create a reference variable called animal whose type is AbstractAnimal
        //Create an actual AbstractDog object.
        AbstractAnimal animal = new AbstractDog();

        animal.sayHello();
        animal.sayBye();
        animal.sleep();
    }
}
abstract class AbstractAnimal {
    String color;
    boolean hasSuperPowers;

    //abstract class can have constructors
    public AbstractAnimal() {
        hasSuperPowers = false;
    }

    abstract void sayHello();
    abstract void sayBye();

    //concrete methods
    void sleep() {
        System.out.println("Sleeping");
    }
}

class AbstractDog extends AbstractAnimal {

    @Override
    void sayHello() {
        System.out.println("Woof");
    }

    @Override
    void sayBye() {
        System.out.println("Bye");
    }
}

interface Mobile {
    void makeCall();
}

interface MusicPlayer {
    void playMusic();
}


//Through interface you can achieve multiple inheritance
class SmartPhone implements Mobile , MusicPlayer{

    @Override
    public void makeCall() {
        System.out.println("Call");
    }
    @Override
    public void playMusic() {
        System.out.println("Play");
    }
}