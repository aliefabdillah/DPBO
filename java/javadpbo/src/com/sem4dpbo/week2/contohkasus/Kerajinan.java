package com.sem4dpbo.week2.contohkasus;

public class Kerajinan extends HasilKerajinan {
    private int harga;
    private String fungsi;

    Kerajinan(){}

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setFungsi(String fungsi) {
        this.fungsi = fungsi;
    }

    public int getHarga() {
        return harga;
    }

    public String getFungsi() {
        return fungsi;
    }
}
