package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    public Millenials(String nameUser) {
        super(nameUser);
        this.socialPublisher = new SnapchatPublisher();
    }
}
