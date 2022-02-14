package com.sem4dpbo.week2.praktikum2.latihanpraktikum2_java;

public class Product {
    private long price;
    private String idProduct;

//    constructor
    public Product(){}

    public Product(String paramIdProduct, long paramPrice){
        this.price = paramPrice;
        this.idProduct = paramIdProduct;
    }

//    method get and set
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public String getIdProduct() {
        return idProduct;
    }
}


