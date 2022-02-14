package com.sem4dpbo.week2.marimencoba;

public class PengusahaRestoran extends IndustriKuliner{
    private String namaRestoran, kodeRestoran;

//    constructor
    public PengusahaRestoran(){}

//    set dan get method
        //set method
    public void setKodeRestoran(String kodeRestoran) {
        this.kodeRestoran = kodeRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

        //get method
    public String getKodeRestoran() {
        return kodeRestoran;
    }

    public String getNamaRestoran() {
        return namaRestoran;
    }
}
