package com.sem4dpbo.week3.praktikum3.latihanpraktikum3_java;

public class Processor {
    private String name;
    private Long procPrice;

    //constructor
    Processor() {}
    Processor(String name, long price) {
        this.name = name;
        this.procPrice = price;
    }

    //set and get name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //set and get price
    public Long getProcPrice() {
        return procPrice;
    }

    public void setProcPrice(Long procPrice) {
        this.procPrice = procPrice;
    }

    public void printProcessor(){
        System.out.println("-Data Processor");
        System.out.println(" Name            : "+this.name);
        System.out.println(" Processor Price : "+this.procPrice);
        System.out.println("------------------------------------");
    }
}
