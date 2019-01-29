package com.kodilla.good.patterns.challenges.food;

public class Order {
    private User user;
    private String producer;
    private Product product;
    private String nameOrder;

    public Order(User user , String producer , Product product , String nameOrder) {
        this.user = user;
        this.producer = producer;
        this.product = product;
        this.nameOrder = nameOrder;
    }

    public User getUser() {
        return user;
    }

    public String getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public String getNameOrder() {
        return nameOrder;
    }
}
