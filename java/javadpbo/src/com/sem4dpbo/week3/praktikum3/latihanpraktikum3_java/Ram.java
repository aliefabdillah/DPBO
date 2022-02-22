package com.sem4dpbo.week3.praktikum3.latihanpraktikum3_java;

public class Ram {
    private String ramCapacity;
    private Long ramPrice;

    //constructor
    Ram(){}
    Ram(String ramCapacity, Long ramPrice){
        this.ramCapacity = ramCapacity;
        this.ramPrice = ramPrice;
    }

    //set and get capacity
    public String getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(String ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    //set and get price
    public Long getRamPrice() {
        return ramPrice;
    }

    public void setRamPrice(Long ramPrice) {
        this.ramPrice = ramPrice;
    }

    public void printRam(){
        System.out.println("-Data RAM");
        System.out.println(" Ram Capacity : " + this.ramCapacity);
        System.out.println(" Ram Price : " + this.ramPrice);
        System.out.println("------------------------------------");
    }
}
