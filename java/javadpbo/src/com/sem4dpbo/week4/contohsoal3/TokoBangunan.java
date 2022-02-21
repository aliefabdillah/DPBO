package com.sem4dpbo.week4.contohsoal3;

public class TokoBangunan {
    private String kodeToko, namaToko, alamatToko;  //properties kode, nama, dan alamat toko

    TokoBangunan(){}

    TokoBangunan(String kodeToko, String namaToko, String alamatToko){
        this.kodeToko = kodeToko;
        this.namaToko = namaToko;
        this.alamatToko = alamatToko;
    }

//  get and set kodetoko
    public String getKodeToko() {
        return kodeToko;
    }

    public void setKodeToko(String kodeToko) {
        this.kodeToko = kodeToko;
    }

//    get and set nama toko
    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

//    get and set alamat toko
    public String getAlamatToko() {
        return alamatToko;
    }

    public void setAlamatToko(String alamatToko) {
        this.alamatToko = alamatToko;
    }
}
