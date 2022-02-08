package com.sem4dpbo.week2.contohkasus;

public class Pengusaha {
    private int nomorUsaha;
    private String nama, alamat, namaUsaha;

    Pengusaha(){}

    Pengusaha(String nama, String alamat, String namaUsaha, int nomorUsaha){
        this.nomorUsaha = nomorUsaha;
        this.nama = nama;
        this.alamat = alamat;
        this.namaUsaha = namaUsaha;
    }

    //method set
    public void setNomorUsaha(int nomorUsaha) {
        this.nomorUsaha = nomorUsaha;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNamaUsaha(String namaUsaha) {
        this.namaUsaha = namaUsaha;
    }

    //method get
    public int getNomorUsaha() {
        return nomorUsaha;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNamaUsaha() {
        return namaUsaha;
    }
}
