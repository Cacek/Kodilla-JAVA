package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .forEach(System.out::println);

        OptionalDouble avg = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();
        return avg;
    }
}
