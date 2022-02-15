package com.sem4dpbo.week3.marimencoba3;

public class Semen extends BahanBangunan {
    private String namaSemen, kodePabrik, kualitas, harga;

//    constructor
    public Semen(){}

//    set and get emthod
    public String getNamaSemen() {
        return namaSemen;
    }

    public void setNamaSemen(String namaSemen) {
        this.namaSemen = namaSemen;
    }

    public String getKodePabrik() {
        return kodePabrik;
    }

    public void setKodePabrik(String kodePabrik) {
        this.kodePabrik = kodePabrik;
    }

    public String getKualitas() {
        return kualitas;
    }

    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

}
