package com.sem4dpbo.week2.marimencoba;

public class Restoran extends PengusahaRestoran{
    private String jenisRestoran, pangsaPasar;

//    constructor
    public Restoran(){}

//    method set dan get masing masing atribut
        //set mtehod
    public void setJenisRestoran(String jenisRestoran) {
        this.jenisRestoran = jenisRestoran;
    }

    public void setPangsaPasar(String pangsaPasar) {
        this.pangsaPasar = pangsaPasar;
    }
        //get method
    public String getJenisRestoran() {
        return jenisRestoran;
    }

    public String getPangsaPasar() {
        return pangsaPasar;
    }
}
