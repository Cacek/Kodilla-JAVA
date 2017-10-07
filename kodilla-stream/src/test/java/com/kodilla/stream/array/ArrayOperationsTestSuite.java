package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }

        //When
        OptionalDouble avg = ArrayOperations.getAverage(ints);
        //double z = avg.getAsDouble();

        //Then
        Assert.assertEquals(5.5, avg.getAsDouble(), 0);

    }
}
