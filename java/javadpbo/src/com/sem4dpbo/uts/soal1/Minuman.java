package com.sem4dpbo.uts.soal1;

public class Minuman {
    private String kodeMinuman;
    private String namaMinuman;
    private int kandunganGula;
    private String jenisMinuman;
    private String noIjinPabrik;
    
//    contructor
    public Minuman(){}
    
    public Minuman(String kode, String namaMinuman, int kandunganGula, String jenisMinuman, String noIjinPabrik) {
        this.kodeMinuman = kode;
        this.namaMinuman = namaMinuman;
        this.kandunganGula = kandunganGula;
        this.jenisMinuman = jenisMinuman;
        this.noIjinPabrik = noIjinPabrik;
    }

//    geetter and sett kode minuman
    public String getKodeMinuman() {
        return kodeMinuman;
    }

    public void setKodeMinuman(String kodeMinuman) {
        this.kodeMinuman = kodeMinuman;
    }

//    getter and setter nama minuman
    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

//    getter and setter kandungan int
    public int getKandunganGula() {
        return kandunganGula;
    }

    public void setKandunganGula(int kandunganGula) {
        this.kandunganGula = kandunganGula;
    }

//    getter and setter jenis minuman
    public String getJenisMinuman() {
        return jenisMinuman;
    }

    public void setJenisMinuman(String jenisMinuman) {
        this.jenisMinuman = jenisMinuman;
    }

//    getter and setter no ijin pabrik
    public String getNoIjinPabrik() {
        return noIjinPabrik;
    }

    public void setNoIjinPabrik(String noIjinPabrik) {
        this.noIjinPabrik = noIjinPabrik;
    }

    public void printMinuman(){
        System.out.println("- Kode : " + getKodeMinuman());
        System.out.println("- Nama : " + getNamaMinuman());
        System.out.println("- Jenis : " + getJenisMinuman());
        System.out.println("- Kandungan Gula : " + getKandunganGula() + "%");
        System.out.println("- No ijin Pabrik : " + getNoIjinPabrik());
    }
}
