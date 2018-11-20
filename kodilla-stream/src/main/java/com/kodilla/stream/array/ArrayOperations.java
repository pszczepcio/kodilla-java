package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers){
        IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
               .forEach(s ->System.out.print(s + " "));
       System.out.println();

       OptionalDouble average;
        average = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average();

        return average;
    }
}
