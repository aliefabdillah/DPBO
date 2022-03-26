package com.sem4dpbo.week7.contohuts;

public class Impact {
    private int tahun;
    private String kode;
    private String namaImpact;
    private Boolean dampak;


    public Impact(int tahun, String kode, String namaImpact, Boolean dampak) {
        this.tahun = tahun;
        this.kode = kode;
        this.namaImpact = namaImpact;
        this.dampak = dampak;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaImpact() {
        return namaImpact;
    }

    public void setNamaImpact(String namaImpact) {
        this.namaImpact = namaImpact;
    }

    public Boolean getDampak() {
        return dampak;
    }

    public void setDampak(Boolean dampak) {
        this.dampak = dampak;
    }

    public void cekImpact(){
        System.out.println(getKode());
        System.out.println(getNamaImpact());
        System.out.println(getTahun());
        System.out.println(getDampak());
    }
}
