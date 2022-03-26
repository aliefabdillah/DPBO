package com.sem4dpbo.week7.contohuts;

public class Bangunan {
    private String kode;
    private String jenis;
    private String noBangunan;
    private String alamatBangunan;
    private int ukuranBangunan;
    private int ukuranTanah;


    public Bangunan(String kode, String jenis, String noBangunan, String alamatBangunan, int ukuranBangunan, int ukuranTanah) {
        this.kode = kode;
        this.jenis = jenis;
        this.noBangunan = noBangunan;
        this.alamatBangunan = alamatBangunan;
        this.ukuranBangunan = ukuranBangunan;
        this.ukuranTanah = ukuranTanah;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNoKtp() {
        return noBangunan;
    }

    public void setNoKtp(String noBangunan) {
        this.noBangunan = noBangunan;
    }

    public String getAlamatBangunan() {
        return alamatBangunan;
    }

    public void setAlamatBangunan(String alamatBangunan) {
        this.alamatBangunan = alamatBangunan;
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
