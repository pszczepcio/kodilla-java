package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class TiresCarBuyService implements BuyService {
    private User user = new User("Jan" , "Kowalski");
    private LocalDate buyDay;
    private String tire = "Dębica Frigo 2";
    private boolean dataUser = false;
    private boolean nameTire = false;


    @Override
    public boolean buy(User user , LocalDate buyDay , String product) {
        this.buyDay = buyDay;
        if(this.user.getName().equals(user.getName()) && this.user.getSurName().equals(user.getSurName())){
            dataUser = true;
        }
        if(getTire().equals(product)){
            nameTire = true;
        }
        if(dataUser && nameTire){
            return true;
        }
        return false;
    }

    public String getTire() {
        return tire;
    }
}
