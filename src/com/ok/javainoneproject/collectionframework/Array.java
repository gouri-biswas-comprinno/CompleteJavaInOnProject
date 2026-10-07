package com.ok.javainoneproject.collectionframework;

public class Array {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[4] = 55;
        // 0, 0, 0, 0, 55

        //another way to inizialize is
        // int[] a = { 1, 2, 3, 4, 5};
        System.out.println(a);
        for(int i = 0;i< 5;i++) {
            System.out.println(a[i]);
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
