package com.sem4dpbo.week7.contohuts;

public class Manusia {

    private Sifat objSifat;
    private String noKtp;
    private String namaManusia;
    private String alamat;

    public Manusia(String noKtp, String namaManusia, String alamat) {
//        this.objSifat = objSifat;
        this.noKtp = noKtp;
        this.namaManusia = namaManusia;
        this.alamat = alamat;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNamaManusia() {
        return namaManusia;
    }

    public void setNamaManusia(String namaManusia) {
        this.namaManusia = namaManusia;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Sifat getObjSifat() {
        return objSifat;
    }

    public void setObjSifat(Sifat objSifat) {
        this.objSifat = objSifat;
    }

    public void cekSet(){
        System.out.println("INI SIFAT " + this.objSifat.getNamaSifat());
    }
}
