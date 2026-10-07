package com.ok.javainoneproject.datatypes;

public class Test {
    public static void main(String[] args) {

        // BYTE
        byte a = 100;

        System.out.println("Byte Examples:");
        System.out.println("----------------");
        System.out.println("Original byte value: " + a);
        System.out.println("Smallest positive byte: " + 1);
        System.out.println("Largest positive byte: " + Byte.MAX_VALUE);
        System.out.println("Largest negative byte: " + -1);
        System.out.println("Smallest negative byte: " + Byte.MIN_VALUE);
        System.out.println();


        // SHORT
        short b = 1000;

        System.out.println("Short Examples:");
        System.out.println("----------------");
        System.out.println("Original short value: " + b);
        System.out.println("Smallest positive short: " + 1);
        System.out.println("Largest positive short: " + Short.MAX_VALUE);
        System.out.println("Largest negative short: " + -1);
        System.out.println("Smallest negative short: " + Short.MIN_VALUE);
        System.out.println();


        // INT
        int c = 50000;

        System.out.println("Int Examples:");
        System.out.println("----------------");
        System.out.println("Original int value: " + c);
        System.out.println("Smallest positive int: " + 1);
        System.out.println("Largest positive int: " + Integer.MAX_VALUE);
        System.out.println("Largest negative int: " + -1);
        System.out.println("Smallest negative int: " + Integer.MIN_VALUE);
        System.out.println();


        // LONG
        long d = 123456789L;

        System.out.println("Long Examples:");
        System.out.println("----------------");
        System.out.println("Original long value: " + d);
        System.out.println("Smallest positive long: " + 1);
        System.out.println("Largest positive long: " + Long.MAX_VALUE);
        System.out.println("Largest negative long: " + -1);
        System.out.println("Smallest negative long: " + Long.MIN_VALUE);
        System.out.println();


        // FLOAT
        float e = 123.4567897f;

        System.out.println("Float Examples:");
        System.out.println("----------------");
        System.out.println("Original float value: " + e);
        System.out.println("Smallest positive float: " + Float.MIN_VALUE);
        System.out.println("Largest positive float: " + Float.MAX_VALUE);
        System.out.println("Largest negative float: " + -Float.MIN_VALUE);
        System.out.println("Smallest negative float: " + -Float.MAX_VALUE);
        System.out.println();


        // DOUBLE
        double f = 123.456789123456;

        System.out.println("Double Examples:");
        System.out.println("----------------");
        System.out.println("Original double value: " + f);
        System.out.println("Smallest positive double: " + Double.MIN_VALUE);
        System.out.println("Largest positive double: " + Double.MAX_VALUE);
        System.out.println("Largest negative double: " + -Double.MIN_VALUE);
        System.out.println("Smallest negative double: " + -Double.MAX_VALUE);
        System.out.println();


        // CHAR
        char g = 'A';

        System.out.println("Char Examples:");
        System.out.println("----------------");
        System.out.println("Original char value: " + g);
        System.out.println("Smallest char: " + (int) Character.MIN_VALUE);
        System.out.println("Largest char: " + (int) Character.MAX_VALUE);
        System.out.println();


        // BOOLEAN
        boolean h = true;

        System.out.println("Boolean Examples:");
        System.out.println("----------------");
        System.out.println("Original boolean value: " + h);
        System.out.println("Boolean value 1: true");
        System.out.println("Boolean value 2: false");

        System.out.println((char) 10084);


//        //widening conversion
//        byte byteValue = 10;  // 1 byte // cup
//        short shortValue = byteValue; // 2 bytes // glass
//        int intValue = shortValue; // 4 bytes // jug
//        long longValue = intValue; // 8 bytes // bucket
//        float floatValue = longValue; // 4 bytes
//        double doubleValue = floatValue; // 8 bytes
//
//        System.out.println("byte value: " + byteValue);
//        System.out.println("short value: " + shortValue);
//        System.out.println("int value: " + intValue);
//        System.out.println("long value: " + longValue);
//        System.out.println("float value: " + floatValue);
//        System.out.println("double value: " + doubleValue);


        // narrowing conversion
        double doubleValue = 10.5;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;

        System.out.println("double value: " + doubleValue);
        System.out.println("float value: " + floatValue);
        System.out.println("long value: " + longValue);
        System.out.println("int value: " + intValue);
        System.out.println("short value: " + shortValue);
        System.out.println("byte value: " + byteValue);

        // string
        String s1 = "Hello"; // Literal , and allocation of memory new in string pool ,store the value
        String s2 = "Hello"; // here refers to the memory location of string pool of s1
        String s3 = new String("hello"); // Contructor creating a new obj outside that pool

        System.out.println(s1 == s2); // true (same reference in pool)
        System.out.println(s1 == s3); // false as different objects
        System.out.println(s1.equals(s3)); // true ( same content)

        String str = "Hello World";

        // Length
        System.out.println("Length: " + str.length());

        // Character at index
        System.out.println("Character: " + str.charAt(0));

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Contains
        System.out.println("Contains World: " + str.contains("World"));

        // Equals
        System.out.println("Equals: " + str.equals("Hello World"));

        // Substring
        System.out.println("Substring: " + str.substring(0, 5));

        // Replace
        System.out.println("Replace: " + str.replace("World", "Java"));

        // Concatenation
        String name = "Gouri";
        String message = "Hello " + name;

        System.out.println("Concatenation: " + message);



        int a1 = 20;
        int a2 = 5;

        // Addition
        System.out.println("Addition: " + (a1 + a2));

        // Subtraction
        System.out.println("Subtraction: " + (a1 - a2));

        // Multiplication
        System.out.println("Multiplication: " + (a1 * a2));

        // Division
        System.out.println("Division: " + (a1 / a2));

        // Modulus (Remainder)
        System.out.println("Modulus: " + (a1 % a2));

    }
    }
