package com.sem4dpbo.week7.contohuts;

public class Sifat {
    private String kodeSifat;
    private String namaSifat;

    public Sifat(){

    }
    public Sifat(String kodeSifat, String nama) {
        this.kodeSifat = kodeSifat;
        this.namaSifat = nama;
    }

    public String getKodeSifat() {
        return kodeSifat;
    }

    public void setKodeSifat(String kodeSifat) {
        this.kodeSifat = kodeSifat;
    }

    public String getNamaSifat() {
        return namaSifat;
    }

    public void setNamaSifat(String namaSifat) {
        this.namaSifat = namaSifat;
    }

    public void print(){
        System.out.println(getNamaSifat());
    }
}
