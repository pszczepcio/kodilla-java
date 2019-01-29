package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Shop {
    private Product product;
    private String productName;
    private static String product1 = "PRODUCT1";
    private static String product2 = "PRODUCT2";
    private static String product3 = "PRODUCT3";
    private static int productValue1 = 50;
    private static int productValue2 = 60;
    private static int productValue3 = 70;
    private int index;
    private int diffrenceValue;
    private boolean isProduct;
    private static List<Product>glutenFreeProduct = new ArrayList<>();

    @Override
    public boolean process(Product product) {
        this.product = product;
        for(int i = 0 ; i < getListGlutenFreeProduct().size() ; i++){
            if(getListGlutenFreeProduct().get(i).getNameProduct().equals(this.product.getNameProduct().toUpperCase())){
                isProduct = true;
                index = i;
                break;
            }
        }
        if(getListGlutenFreeProduct().get(index).getValue() >= this.product.getValue() && isProduct){
            diffrenceValue = getListGlutenFreeProduct().get(index).getValue() - this.product.getValue();
            productName = getListGlutenFreeProduct().get(index).getNameProduct();
            getListGlutenFreeProduct().remove(index);
            getListGlutenFreeProduct().add(index , new Product(productName , diffrenceValue));
            return true;
        }else if(getListGlutenFreeProduct().get(index).getValue() < this.product.getValue()){
            System.out.println("We have to small this product.");
            System.out.println();
            return false;
        }
        System.out.println("We don't have this product");
        System.out.println();
       return false;
    }

    public static void creatGlutenFreeList(){
        glutenFreeProduct.add(new Product(product1 , productValue1));
        glutenFreeProduct.add(new Product(product2 , productValue2));
        glutenFreeProduct.add(new Product(product3 , productValue3));
    }

    public List<Product> getListGlutenFreeProduct() {
        return glutenFreeProduct;
    }
}
