package com.kodilla.good.patterns.challenges.food;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcessor {
    private Shop shop;
    private Order order;
    private boolean orderInProgress;
    private Map<String,Shop>listOfProducer = new HashMap<>();


    public OrderProcessor(Order order) {
        this.order = order;
    }

    public HashMap<String,Shop> getListOfProducer() {
        listOfProducer.put("GLUTEN FREE SHOP", new GlutenFreeShop());
        listOfProducer.put("HEALTHY SHOP" , new HealthyShop());
        return (HashMap<String,Shop>) listOfProducer;
    }

    public boolean executionOrder(){
        shop = getListOfProducer().get(order.getProducer().toUpperCase());
        if(shop != null){
            orderInProgress = shop.process(order.getProduct());
        }else{
            System.out.println("We don't have this producer.");
            return false;
        }

       if(orderInProgress){
            Courier courier = new Courier(this.order);
            courier.orderCompleted();
            return true;
       }else{
           System.out.print(order.getNameOrder() + " : ");
           System.out.println("We can't complete this order.");
           System.out.println();
           return false;
       }
    }
}
