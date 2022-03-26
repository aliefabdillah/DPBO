package com.sem4dpbo.week7.contohuts;

public class Rumah {
    private String noKtp;
    private String alamat;
    private int ukuranBangunan;
    private int ukuranTanah;

    public Rumah(){}

    public Rumah(String noKtp, String alamat, int ukuranBangunan, int ukuranTanah) {
        this.noKtp = noKtp;
        this.alamat = alamat;
        this.ukuranBangunan = ukuranBangunan;
        this.ukuranTanah = ukuranTanah;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUkuranBangunan() {
        return ukuranBangunan;
    }

    public void setUkuranBangunan(int ukuranBangunan) {
        this.ukuranBangunan = ukuranBangunan;
    }

    public int getUkuranTanah() {
        return ukuranTanah;
    }

    public void setUkuranTanah(int ukuranTanah) {
        this.ukuranTanah = ukuranTanah;
    }
}
