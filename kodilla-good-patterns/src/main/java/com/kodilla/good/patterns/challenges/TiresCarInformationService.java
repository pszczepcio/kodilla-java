package com.kodilla.good.patterns.challenges;

public class TiresCarInformationService implements InformationService{
    @Override
    public void inform(BuyRequest buyRequest) {
        System.out.println("Customer: " + buyRequest.getUser().getName() + " " + buyRequest.getUser().getSurName());
        System.out.println("Data of order: " + buyRequest.getBuyDay());
        System.out.println("The name of product: " + buyRequest.getProduct());
    }
}
