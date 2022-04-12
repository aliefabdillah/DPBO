package com.sem4dpbo.week8;

public class Autor {
    private String img;
    private String namaAutor;
    private int jmlh_buku;

    public Autor(String img, String namaAutor, int jmlh_buku) {
        this.img = img;
        this.namaAutor = namaAutor;
        this.jmlh_buku = jmlh_buku;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getNamaAutor() {
        return namaAutor;
    }

    public void setNamaAutor(String namaAutor) {
        this.namaAutor = namaAutor;
    }

    public int getJmlh_buku() {
        return jmlh_buku;
    }

    public void setJmlh_buku(int jmlh_buku) {
        this.jmlh_buku = jmlh_buku;
    }
}
