package com.pavi.learning.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<List<Integer>> listOfList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList=listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}
