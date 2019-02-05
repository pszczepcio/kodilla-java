package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    public YGeneration(String nameUser) {
        super(nameUser);
        this.socialPublisher = new TwitterPublisher();
    }
}
