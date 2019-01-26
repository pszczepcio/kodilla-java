package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class BuyRequest {
    private User user;
    private LocalDate buyDay;
    private String product;

    public BuyRequest(User user, LocalDate buyDay , String product) {
        this.user = user;
        this.buyDay = buyDay;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBuyDay() {
        return buyDay;
    }

    public String getProduct() {
        return product;
    }
}
