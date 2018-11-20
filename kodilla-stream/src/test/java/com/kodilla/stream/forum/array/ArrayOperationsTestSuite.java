package com.kodilla.stream.forum.array;

import org.junit.Test;
import org.junit.Assert;
import com.kodilla.stream.array.ArrayOperations;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {
    private final int[] testTable = new int[20];

    @Test
    public void testGetAverage() {
        for (int i = 0; i < 20; i++) {
            testTable[i] = i +2;
        }
        //When
        OptionalDouble average = ArrayOperations.getAverage(testTable);
        //Then
        Assert.assertEquals(11.5, average.getAsDouble(),0.001);

    }
}
