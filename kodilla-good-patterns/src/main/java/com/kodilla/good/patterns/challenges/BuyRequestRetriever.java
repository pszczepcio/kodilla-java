package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class BuyRequestRetriever {
    public BuyRequest retrieve(){
        User user = new User("Jan" , "Kowalski");
        LocalDate buyDay = LocalDate.of(2019 ,1 , 20);
        String product = "Dębica Frigo 2";
        return new BuyRequest(user , buyDay , product);
    }
}
