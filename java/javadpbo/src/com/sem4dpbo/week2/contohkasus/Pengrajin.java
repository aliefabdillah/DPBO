package com.sem4dpbo.week2.contohkasus;

public class Pengrajin extends Pengusaha {
    private int noKTP;
    private double omsetPerBulan;
    private String deskripsi;

    Pengrajin(){}

    Pengrajin(int noKTP, double omsetPerBulan, String deskripsi){
        this.noKTP = noKTP;
        this.omsetPerBulan = omsetPerBulan;
        this.deskripsi = deskripsi;
    }

    public void setNoKTP(int noKTP) {
        this.noKTP = noKTP;
    }

    public void setOmsetPerBulan(double omsetPerBulan) {
        this.omsetPerBulan = omsetPerBulan;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getNoKTP() {
        return noKTP;
    }

    public double getOmsetPerBulan() {
        return omsetPerBulan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
