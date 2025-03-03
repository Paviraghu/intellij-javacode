package com.pavi.learning.java.setexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York");//duplicate

        System.out.println("Cities: " + cities);

        cities.remove("Chicago");
        System.out.println("After removal: " + cities);

        hashSetMethods();

        iteratorInHashSet();
    }

    public static void hashSetMethods() {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.print("Union of the two Set : ");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set : ");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set : ");
        System.out.println(difference);
    }

    public static void iteratorInHashSet() {

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1, 3, 2, 4, 8, 9, 0));

        Iterator<Integer> iterator = a.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
