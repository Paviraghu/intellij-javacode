package com.pavi.learning.java.streams;

import java.util.Arrays;
import java.util.List;

public class Peek {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        numbers.stream()
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 2)
                .forEach(System.out::println);

    }
}
