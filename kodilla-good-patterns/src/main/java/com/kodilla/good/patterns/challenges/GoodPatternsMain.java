package com.kodilla.good.patterns.challenges;

public class GoodPatternsMain {
    public static void main(String[] args) {
        MovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e.toString() + "!")
                .forEach(System.out::print);
    }
}
