package com.kodilla.good.patterns.challenges.food;

public class Courier {
    private String courierName = "DPD";
    private Order order;


    public Courier(Order order) {
        this.order = order;
    }

    public String getCourierName() {
        return courierName;
    }

    public void orderCompleted() {
        System.out.print(this.order.getNameOrder() + ": completed. ");
        System.out.print("Foodthe was delivered to : " + this.order.getUser().getName() + " " );
        System.out.println(this.order.getUser().getSurName() + " from producer " + this.order.getProducer() + ".");
        System.out.println("The product has been delivered by " + getCourierName() + ".");
        System.out.println();
    }
}
