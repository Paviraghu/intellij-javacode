package com.pavi.learning.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squaredNumbers);
    }
}
