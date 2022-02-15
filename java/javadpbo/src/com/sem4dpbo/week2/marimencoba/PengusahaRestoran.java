package com.sem4dpbo.week2.marimencoba;

public class PengusahaRestoran{
    private String kodePengusaha, namaRestoran, kotaPengusaha, kodeRestoran;

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

    public String getKotaPengusaha() {
        return kotaPengusaha;
    }

    public void setKotaPengusaha(String kotaPengusaha) {
        this.kotaPengusaha = kotaPengusaha;
    }

    public String getKodePengusaha() {
        return kodePengusaha;
    }

    public void setKodePengusaha(String kodePengusaha) {
        this.kodePengusaha = kodePengusaha;
    }
}
