package com.sem4dpbo.week2.marimencoba;

public class IndustriKuliner {
    private String noIjin;
    private String namaPemilik;
    private String kota;
    private String deskripsi;

//    constructor
    public IndustriKuliner(){}

//    set dan get method
        //set method
    public void setNoIjin(String noIjin) {
        this.noIjin = noIjin;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

        //get method
    public String getNoIjin() {
        return noIjin;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getKota() {
        return kota;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
