package com.sem4dpbo.uts.soal1;

public class PemilikPabrik implements Manusia {
    private String noKTP;
    private String nama;
    private String alamat;
    private Double kekayaan;

//    constructor
    PemilikPabrik(){}

    PemilikPabrik(String noKTP, String nama, String alamat, Double kekayaan){
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
        this.kekayaan = kekayaan;
    }

//    setter and getter for no ktp
    @Override
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    @Override
    public String getNoKTP() {
        return this.noKTP;
    }

//    setter and getter for nama
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return this.nama;
    }

//    setter and getter for alamat
    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

//    setter and getter for kekayaaan
    public Double getKekayaan() {
        return kekayaan;
    }

    public void setKekayaan(Double kekayaan) {
        this.kekayaan = kekayaan;
    }
}
