package com.kodilla.good.patterns.challenges;

public class BuyDto {
    public User user;
    public boolean isBuy;

    public BuyDto(final User user , final boolean isBuy){
        this.user = user;
        this.isBuy = isBuy;
    }

    public User getUser() {
        return user;
    }

    public boolean isBuy() {
        return isBuy;
    }
}
