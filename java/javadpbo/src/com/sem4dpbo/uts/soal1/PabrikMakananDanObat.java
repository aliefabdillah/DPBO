package com.sem4dpbo.uts.soal1;

public class PabrikMakananDanObat {
    private String noIjin;
    private String noKTP;
    private String namaPemilik;
    private String jenisProduksi;

//    constructor
    public PabrikMakananDanObat(){}

    public PabrikMakananDanObat(String noIjin, String noKTP, String namaPemilik, String jenisProduksi) {
        this.noIjin = noIjin;
        this.noKTP = noKTP;
        this.namaPemilik = namaPemilik;
        this.jenisProduksi = jenisProduksi;
    }

//  getter and setter for no ijin
    public String getNoIjin() {
        return noIjin;
    }

    public void setNoIjin(String noIjin) {
        this.noIjin = noIjin;
    }

//    getter and setter for no ktp
    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

//    getter and setter for nama pemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

//    getter and setter for jenis produksi
    public String getJenisProduksi() {
        return jenisProduksi;
    }

    public void setJenisProduksi(String jenisProduksi) {
        this.jenisProduksi = jenisProduksi;
    }
}
