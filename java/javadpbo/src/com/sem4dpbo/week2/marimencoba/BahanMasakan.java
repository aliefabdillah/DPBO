package com.sem4dpbo.week2.marimencoba;

public class BahanMasakan{
    private String kodeBahan, namaBahan, deskripsi;

//    constructor
    public BahanMasakan(){}

//    set dan get method
        //set method
    public void setKodeBahan(String kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public void setNamaBahan(String namaBahan) {
        this.namaBahan = namaBahan;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

        //get mtehod
    public String getKodeBahan() {
        return kodeBahan;
    }

    public String getNamaBahan() {
        return namaBahan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
