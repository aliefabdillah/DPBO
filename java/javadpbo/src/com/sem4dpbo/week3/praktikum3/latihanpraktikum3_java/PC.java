package com.sem4dpbo.week3.praktikum3.latihanpraktikum3_java;

public class PC {
    private Processor procObj;
    private Disk diskObj;
    private Ram ramObj;
    private long totalPrice;

    PC(){}
    PC(Processor procObj, Disk diskObj, Ram ramObj){
        this.procObj = procObj;
        this.diskObj = diskObj;
        this.ramObj = ramObj;
    }

    public Processor getProcObj() {
        return procObj;
    }

    public void setProcObj(Processor procObj) {
        this.procObj = procObj;
    }

    public Disk getDiskObj() {
        return diskObj;
    }

    public void setDiskObj(Disk diskObj) {
        this.diskObj = diskObj;
    }

    public Ram getRamObj() {
        return ramObj;
    }

    public void setRamObj(Ram ramObj) {
        this.ramObj = ramObj;
    }

    public void countTotal(){
        totalPrice = this.procObj.getProcPrice() + this.diskObj.getDiskPrice() + this.ramObj.getRamPrice();
    }

    public void printPc(){
        this.procObj.printProcessor();
        this.diskObj.printDisk();
        this.ramObj.printRam();
        System.out.println("-Data Pc");
        System.out.println(" Total Price: " + this.totalPrice);
        System.out.println("------------------------------------");
    }
}
