package com.ok.javainoneproject.collectionframework;
import java.util.*;

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


        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(11);
        set.add(111);
        set.contains(2);
        System.out.println(set);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Gouri");
        map.put(2, "Soma");
        map.put(3, "Sania");

        System.out.println(map.get(2));

        //List (Interface) --> implemented by ArrayList & LinkedList (class)
        //Set --> HashSet & LinkedHashSet
        //Map --> HashMap & LinkedHashMap
    }
}
