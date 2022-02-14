package com.sem4dpbo.week2.marimencoba;

public class MasakanIndonesia extends BahanMasakan{
    private String kodeMasakan, nama, bahan, harga;

//    constructor
    public MasakanIndonesia(){}

//    set dan get method
        //set method

    public void setKodeMasakan(String kodeMasakan) {
        this.kodeMasakan = kodeMasakan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

        //get method
    public String getKodeMasakan() {
        return kodeMasakan;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }
}
