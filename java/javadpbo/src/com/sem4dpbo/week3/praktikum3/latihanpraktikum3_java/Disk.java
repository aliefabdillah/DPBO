package com.sem4dpbo.week3.praktikum3.latihanpraktikum3_java;

public class Disk {
    private String type, diskCapacity;
    private Long diskPrice;

//    constructor
    Disk(){}
    Disk(String type, String diskCapacity, Long diskPrice){
        this.type = type;
        this.diskCapacity = diskCapacity;
        this.diskPrice = diskPrice;
    }

    //    set and get type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //set and get disk capacity
    public String getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    //set and get disk price
    public Long getDiskPrice() {
        return diskPrice;
    }

    public void setDiskPrice(Long diskPrice) {
        this.diskPrice = diskPrice;
    }

    public void printDisk(){
        System.out.println("-Data Disk");
        System.out.println(" Type          : "+this.type);
        System.out.println(" Disk Capacity : "+this.diskCapacity);
        System.out.println(" Disk Price    : "+this.diskPrice);
        System.out.println("------------------------------------");
    }

}
