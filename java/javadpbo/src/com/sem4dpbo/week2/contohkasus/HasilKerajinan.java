package com.sem4dpbo.week2.contohkasus;

public class HasilKerajinan {
    private int kodeKerajinan;
    private String bahan, namaKerajinan;

    HasilKerajinan(){}

    public void setKodeKerajinan(int kodeKerajinan) {
        this.kodeKerajinan = kodeKerajinan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setNamaKerajinan(String namaKerajinan) {
        this.namaKerajinan = namaKerajinan;
    }

    public int getKodeKerajinan() {
        return kodeKerajinan;
    }

    public String getBahan() {
        return bahan;
    }

    public String getNamaKerajinan() {
        return namaKerajinan;
    }
}
