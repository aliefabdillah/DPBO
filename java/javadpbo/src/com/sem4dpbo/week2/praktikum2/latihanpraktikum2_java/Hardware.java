package com.sem4dpbo.week2.praktikum2.latihanpraktikum2_java;

public class Hardware extends Product{
    private String brand, model;

//    constructor
    public Hardware(){}

    public Hardware(String paramIdProduct, long paramPrice, String paramBrand, String paramModel){
        this.setPrice(paramPrice);
        this.setIdProduct(paramIdProduct);
        this.brand = paramBrand;
        this.model = paramModel;
    }

//    method set and get
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
