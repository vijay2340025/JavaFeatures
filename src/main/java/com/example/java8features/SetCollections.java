package com.example.java8features;

import java.util.*;

public class SetCollections {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(1);
        System.out.println(treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        System.out.println(hashSet);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.forEach((key, value) -> System.out.println(value));

    }
}
