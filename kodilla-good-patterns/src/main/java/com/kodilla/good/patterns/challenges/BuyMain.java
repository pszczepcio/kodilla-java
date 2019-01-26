package com.kodilla.good.patterns.challenges;

public class BuyMain {
    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new TiresCarInformationService() , new TiresCarBuyService() , new TiresCarBuyRepository());
        productOrderService.process(buyRequest);
    }
}
