package com.sem4dpbo.week2.marimencoba;

public class Masakan extends BahanMasakan{
    private String kodeMasakan, nama, harga, negara;

    //    constructor
    public Masakan(){}

    //  Method set and get
    public String getKodeMasakan() {
        return kodeMasakan;
    }

    public void setKodeMasakan(String kodeMasakan) {
        this.kodeMasakan = kodeMasakan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }
}
