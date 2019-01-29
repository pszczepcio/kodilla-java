package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Shop {
    private Product product;
    private int index;
    private String productName1;
    private int diffrenceValue1;
    private static String  product4 = "PRODUCT4";
    private static String  product5 = "PRODUCT5";
    private static String  product6 = "PRODUCT6";
    private static int productValue4 = 30;
    private static int productValue5 = 40;
    private static int productValue6= 25;
    private boolean isProduct;
    private static List<Product> healthyProduct = new ArrayList<>();

    @Override
    public boolean process(Product product) {
        this.product = product;
        for(int i = 0 ; i < getListHealthyProduct().size() ; i++){
            if(getListHealthyProduct().get(i).getNameProduct().equals(this.product.getNameProduct().toUpperCase())){
                isProduct = true;
                index = i;
                break;
            }
        }
        if(getListHealthyProduct().get(index).getValue() >= this.product.getValue() && isProduct){
            diffrenceValue1 = getListHealthyProduct().get(index).getValue() - this.product.getValue();
            productName1 = getListHealthyProduct().get(index).getNameProduct();
            getListHealthyProduct().remove(index);
            getListHealthyProduct().add(index , new Product(productName1 , diffrenceValue1));
            return true;
        }else if(getListHealthyProduct().get(index).getValue() < this.product.getValue()){
            System.out.println("We have to small this product.");
            return false;
        }
        System.out.println("We don't have this product");
        return false;
    }

    public static void creatHealthyProduct(){
        healthyProduct.add(new Product(product4 , productValue4));
        healthyProduct.add(new Product(product5 , productValue5));
        healthyProduct.add(new Product(product6 , productValue6));
    }

    public List<Product> getListHealthyProduct() {
        return healthyProduct;
    }
}
