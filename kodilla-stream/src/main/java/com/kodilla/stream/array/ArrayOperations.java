package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getAverage(int[] numbers) {

        int arrayElements = IntStream.range(0, numbers.length)

            .forEach(System.out.println());
    }
}
