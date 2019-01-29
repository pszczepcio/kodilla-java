package com.kodilla.good.patterns.challenges.food;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcessor {
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
       for (Map.Entry<String,Shop> entry : getListOfProducer().entrySet()){
           if(entry.getKey().equals(order.getProducer().toUpperCase())){
               Shop shop = getListOfProducer().get(order.getProducer().toUpperCase());
               orderInProgress = shop.process(order.getProduct());
               break;
           }
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
      //  return false;
    }
}
