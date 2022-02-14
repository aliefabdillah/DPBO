package com.sem4dpbo.week2.praktikum2.latihanpraktikum2_java;

public class Memory extends Hardware{
    private int frequency, memorySize;
    private boolean supportsCuda;

//  Constructor
    public Memory(){}

    public Memory(String paramIdProduct, long paramPrice, String paramBrand, String paramModel, int paramFrequency, int paramMemorySize, boolean paramSupportsCuda){
        this.setPrice(paramPrice);
        this.setIdProduct(paramIdProduct);
        this.setBrand(paramBrand);
        this.setModel(paramModel);
        this.frequency = paramFrequency;
        this.memorySize = paramMemorySize;
        this.supportsCuda = paramSupportsCuda;
    }

//    method get and set
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setSupportsCuda(boolean supportsCuda) {
        this.supportsCuda = supportsCuda;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public boolean isSupportsCuda() {
        return supportsCuda;
    }
}
