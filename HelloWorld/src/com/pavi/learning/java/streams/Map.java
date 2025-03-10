package com.pavi.learning.java.streams;

import java.util.Arrays;
import java.util.List;

public class Map {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
