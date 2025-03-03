package com.pavi.learning.java.streams;

import java.util.stream.Stream;

public class LimitNSkip {

    public static void main(String[] args) {

            Stream.of(1, 2, 3, 4, 5)
                    .limit(3)
                    .forEach(System.out::println);

            System.out.println("Skip Elements ");

            Stream.of(1, 2, 3, 4, 5)
                    .skip(2)
                    .forEach(System.out::println);

    }
}
