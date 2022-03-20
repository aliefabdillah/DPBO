package com.sem4dpbo.week7.interfaceAset;

public class Gudang extends Bangunan implements Aset{

//    private atribut
    private int kodeAset;
    private String jenisAset;
    private double nilaiAset;
    private int kodeGudang;
    private String namaGudang;
    private String alamatGudang;

//    contructor
    public Gudang() {
    }

//    getter and setter aset
    @Override
    public void setKodeAset(int kodeAset) {
        this.kodeAset = kodeAset;
    }

    @Override
    public void setJenisAset(String jenisAset) {
        this.jenisAset = jenisAset;
    }

    @Override
    public void setNilaiAset(double nilaiAset) {
        this.nilaiAset = nilaiAset;
    }

    @Override
    public int getKodeAset() {
        return this.kodeAset;
    }

    @Override
    public String getJenisAset() {
        return this.jenisAset;
    }

    @Override
    public double getNilaiAset() {
        return this.nilaiAset;
    }

//    getter and setter gudang
    public int getKodeGudang() {
        return kodeGudang;
    }

    public void setKodeGudang(int kodeGudang) {
        this.kodeGudang = kodeGudang;
    }

    public String getNamaGudang() {
        return namaGudang;
    }

    public void setNamaGudang(String namaGudang) {
        this.namaGudang = namaGudang;
    }

    public String getAlamatGudang() {
        return alamatGudang;
    }

    public void setAlamatGudang(String alamatGudang) {
        this.alamatGudang = alamatGudang;
    }
}
