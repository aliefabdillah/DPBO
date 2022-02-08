package com.sem4dpbo.week2.contohkasus;

public class KomoditasExport {
    private String negaraTujuan, jenisKomoditas;
    private int kodeKomoditas;

    KomoditasExport(){}

    public void setKodeKomoditas(int kodeKomoditas) {
        this.kodeKomoditas = kodeKomoditas;
    }

    public void setNegaraTujuan(String negaraTujuan) {
        this.negaraTujuan = negaraTujuan;
    }

    public void setJenisKomoditas(String jenisKomoditas) {
        this.jenisKomoditas = jenisKomoditas;
    }

    public int getKodeKomoditas() {
        return kodeKomoditas;
    }

    public String getJenisKomoditas() {
        return jenisKomoditas;
    }

    public String getNegaraTujuan() {
        return negaraTujuan;
    }
}
