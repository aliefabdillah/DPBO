package com.sem4dpbo.week3.marimencoba3;

public class PenjualBahanBangunan extends TokoBangunan {
    private String noKtp, namaPenjual;

//    constructor
    public PenjualBahanBangunan(){}

//    set and get method
    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }
}
