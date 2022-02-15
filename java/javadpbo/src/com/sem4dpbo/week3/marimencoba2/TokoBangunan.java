package com.sem4dpbo.week3.marimencoba2;

public class TokoBangunan {
    private String kodeToko, NamaToko, alamatToko;

//    constructor
    public TokoBangunan(){}

//    set dan get method

    //get and set Kode toko
    public String getKodeToko() {
        return kodeToko;
    }

    public void setKodeToko(String kodeToko) {
        this.kodeToko = kodeToko;
    }

    //get and set nama toko
    public String getNamaToko() {
        return NamaToko;
    }

    public void setNamaToko(String namaToko) {
        NamaToko = namaToko;
    }

    //get and set atribut alamat toko
    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }
}
