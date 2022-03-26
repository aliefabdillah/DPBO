package com.sem4dpbo.uts.soal1;

public class Obat {
    private String kodeObat;
    private String namaObat;
    private String jenisObat;
    private int dosisPerHari;
    private String bentuk;
    private String penyakit;
    private String noIjinPabrik;

//    constructor
    public Obat(){}
    public Obat(String kodeObat, String namaObat, String jenisObat, int dosisPerHari, String bentuk, String penyakit, String noIjinPabrik) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.dosisPerHari = dosisPerHari;
        this.bentuk = bentuk;
        this.penyakit = penyakit;
        this.noIjinPabrik = noIjinPabrik;
    }

//    getter and setter kode obat
    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

//    getter and setter nama obat
    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

//    getter and setter jenis obat
    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }

//    getter and setter Dosis
    public int getDosisPerHari() {
        return dosisPerHari;
    }

    public void setDosisPerHari(int dosisPerHari) {
        this.dosisPerHari = dosisPerHari;
    }

//    getter and setter Bentuk
    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

//    getter and setter Penyakit
    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

//    getter and setter No ijin pabrik
    public String getNoIjinPabrik() {
        return noIjinPabrik;
    }

    public void setNoIjinPabrik(String noIjinPabrik) {
        this.noIjinPabrik = noIjinPabrik;
    }

    public void printObat(){
        System.out.println("- Kode : " + getKodeObat());
        System.out.println("- Nama : " + getNamaObat());
        System.out.println("- Jenis : " + getJenisObat());
        System.out.println("- Dosis Per Hari : " + getDosisPerHari() + " / hari");
        System.out.println("- Bentuk : " + getBentuk());
        System.out.println("- Penyakit : " + getPenyakit());
        System.out.println("- No ijin Pabrik : " + getNoIjinPabrik());
    }
}
