package com.kodilla.good.patterns.challenges.food;

public class FoodMain {
    public static void main(String[] args) {
        GlutenFreeShop.creatGlutenFreeList();
        HealthyShop.creatHealthyProduct();

        OrderGenerator orderGenerator = new OrderGenerator();
        Order order = orderGenerator.retriev();
        Order order1 = orderGenerator.retriev2();
        Order order2 = orderGenerator.retriev3();

        OrderProcessor orderProcessor = new OrderProcessor(order);
        orderProcessor.executionOrder();

        OrderProcessor orderProcessor1 = new OrderProcessor(order1);
        orderProcessor1.executionOrder();

        OrderProcessor orderProcessor2 = new OrderProcessor(order2);
        orderProcessor2.executionOrder();
    }
}
