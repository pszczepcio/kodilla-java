package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String nameUser) {
        super(nameUser);
        this.socialPublisher = new FacebookPublisher();
    }
}
