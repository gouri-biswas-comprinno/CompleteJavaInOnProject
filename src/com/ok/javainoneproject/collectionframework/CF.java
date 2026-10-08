package com.ok.javainoneproject.collectionframework;

import java.util.ArrayList;

public class CF {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(11);
        arrayList.add(111);

        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList.add(1);
        arrayList.add(11);
        arrayList.add(111);

        arrayList.addAll(arrayList2);

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.contains(11));

        //List (Interface) --> implemented by ArrayList & LinkedList (class)
        //Set --> HashSet & LinkedHashSet
        //Map --> HashMap & LinkedHashMap
    }
}
