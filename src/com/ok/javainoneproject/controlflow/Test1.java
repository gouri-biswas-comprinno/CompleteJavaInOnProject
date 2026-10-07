package com.ok.javainoneproject.controlflow;

public class Test1 {

    public static void main(String[] args) {

        int it1 = 5;
        int it2 = 3;

        // Relational Operators
        System.out.println("Equal: " + (it1 == it2));
        System.out.println("Not Equal: " + (it1 != it2));
        System.out.println("Greater Than: " + (it1 > it2));
        System.out.println("Less Than: " + (it1 < it2));
        System.out.println("Greater Than or Equal: " + (it1 >= it2));
        System.out.println("Less Than or Equal: " + (it1 <= it2));

        // Logical Operators
        boolean value1 = true;
        boolean value2 = false;

        System.out.println("Logical AND: " + (value1 && value2));
        System.out.println("Logical OR: " + (value1 || value2));
        System.out.println("Logical NOT: " + (!value1));


        //Conditional Statement
        boolean isSunny = true;
        boolean isWarm = true;

        if(isSunny && isWarm){
            System.out.println("Beach DAy");
        }
    }
}