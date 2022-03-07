package com.sem4dpbo.week6.contohpolymorfism;

public class Buku {
    private String judul;
    private int tahun;
    private String pengarang;

    Buku(){}

    Buku(String judul, int tahun, String pengarang){
        this.judul = judul;
        this.tahun = tahun;
        this.pengarang = pengarang;
    }

    public void setBuku(String judul){
        this.judul = judul;
    }

    public void setBuku(String judul, int tahun){
        this.judul = judul;
        this.tahun = tahun;
    }

    public void setBuku(String judul, int tahun, String pengarang){
        this.judul = judul;
        this.tahun = tahun;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
