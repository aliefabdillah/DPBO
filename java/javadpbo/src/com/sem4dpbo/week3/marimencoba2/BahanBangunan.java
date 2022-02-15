package com.sem4dpbo.week3.marimencoba2;

public class BahanBangunan {
    private String kodeBahan, kategoriJenisBahan, kualitas, harga;          //properties kualitas dan harga dari atribut semen dan genteng naik ke parent class

//    constructor
    BahanBangunan(){}

//    set and get method
    public String getKodeBahan() {
        return kodeBahan;
    }

    public void setKodeBahan(String kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

    public String getKategoriJenisBahan() {
        return kategoriJenisBahan;
    }

    public void setKategoriJenisBahan(String kategoriJenisBahan) {
        this.kategoriJenisBahan = kategoriJenisBahan;
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
