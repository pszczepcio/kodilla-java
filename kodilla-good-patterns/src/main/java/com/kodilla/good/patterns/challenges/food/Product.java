package com.kodilla.good.patterns.challenges.food;

public class Product {
    private String nameProduct;
    private int value;

    public String getNameProduct() {
        return nameProduct;
    }

    public int setValue(int value) {
        this.value = value;
        return getValue();
    }

    public int getValue() {
        return value;
    }

    public Product(String nameProduct, int value) {
        this.nameProduct = nameProduct;
        this.value = value;
    }
}
