package com.kodilla.good.patterns.challenges.food;

public class OrderGenerator {
    public Order retriev() {
         User user = new User("Jan" , "Kowalski");
         String nameProduct = "product8";
         String nameOrder = "Order_1";
         int value = 20;
         String producer = "Gluten Free Shop";
         Product product = new Product(nameProduct , value);
         return new Order(user , producer , product , nameOrder);
    }
    public Order retriev2() {
        User user = new User("Jan" , "Kowalski");
        String nameProduct = "product1";
        String nameOrder = "Order_2";
        int value = 20;
        String producer = "Gluten Free Shop";
        Product product = new Product(nameProduct , value);
        return new Order(user , producer , product , nameOrder);
    }

    public Order retriev3() {
        User user1 = new User("Mikołaj" , "Nowak");
        String nameProduct = "product6";
        String nameOrder = "Order_3";
        int value = 25;
        String producer = "Healthy Shop";
        Product product = new Product(nameProduct , value);
        return new Order(user1 , producer , product , nameOrder);
    }

}
