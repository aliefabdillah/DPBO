package com.sem4dpbo.week7.contohuts;

public class Kecurangan extends Sifat{
    private Impact objImpact;
    private int punishment;
    private int tahun;


    public Kecurangan(String kodeSifat, String nama, int punishment, int tahun) {
        super(kodeSifat, nama);
        this.punishment = punishment;
        this.tahun = tahun;
    }

    public void setObjImpact(Impact objImpact) {
        this.objImpact = objImpact;
    }

    public void cek(){
        System.out.println(getKodeSifat());
        System.out.println(getNamaSifat());
        this.objImpact.cekImpact();
    }
}
