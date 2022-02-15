package com.sem4dpbo.week3.marimencoba2;

public class Genteng extends BahanBangunan{
    private String namaGenteng, kodePabrik, kualitas, harga;

//    constrcutor
    public Genteng(){}

//    set and get method
    public String getNamaGenteng() {
        return namaGenteng;
    }

    public void setNamaGenteng(String namaGenteng) {
        this.namaGenteng = namaGenteng;
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
