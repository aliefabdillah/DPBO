package com.sem4dpbo.week2.marimencoba;

public class MasakanAsing extends BahanMasakan{
    private String kodeMasakan, nama, bahan, harga, negara;

//    constructor
    public MasakanAsing(){}

//    set dan get method
    //set method
    public void setKodeMasakan(String kodeMasakan) {
        this.kodeMasakan = kodeMasakan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    //get method
    public String getKodeMasakan() {
        return kodeMasakan;
    }

    public String getNama() {
        return nama;
    }

    public String getBahan() {
        return bahan;
    }

    public String getHarga() {
        return harga;
    }

    public String getNegara() {
        return negara;
    }
}
