package com.pavi.learning.java.streams;

import java.util.Arrays;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        names.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sort in Reverse Order ");

        names.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

    }
}
