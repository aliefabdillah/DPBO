package com.sem4dpbo.uts.soal1;

public class BahanKonsumsiOral {
    private String kodeBahan;
    private String Deskripsi;
    private String jenisBahan;
    private String kegunaan;

//    constructor
    public BahanKonsumsiOral(){}

    public BahanKonsumsiOral(String kodeBahan, String deskripsi, String jenisBahan, String kegunaan) {
        this.kodeBahan = kodeBahan;
        Deskripsi = deskripsi;
        this.jenisBahan = jenisBahan;
        this.kegunaan = kegunaan;
    }

//    getter and setter for kode
    public String getKodeBahan() {
        return kodeBahan;
    }

    public void setKodeBahan(String kodeBahan) {
        this.kodeBahan = kodeBahan;
    }

//    getter and setter for Deskripsi
    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

//    getter and setter for jenis bahan
    public String getJenisBahan() {
        return jenisBahan;
    }

    public void setJenisBahan(String jenisBahan) {
        this.jenisBahan = jenisBahan;
    }

//    getter and setter for kegunaan
    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }

}
