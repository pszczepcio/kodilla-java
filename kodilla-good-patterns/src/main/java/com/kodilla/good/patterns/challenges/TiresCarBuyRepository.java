package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class TiresCarBuyRepository implements BuyRepository{
    private User user;
    private LocalDate buyDay;
    private String product;
    @Override
    public boolean createBuy(User user, LocalDate localDate, String product) {
        this.user = user;
        this.buyDay = localDate;
        this.product = product;
        return true;
    }
}
