package com.sem4dpbo.week8;

public class Buku {
    private String img;
    private String penerbit;
    private String autor;
    private String desc;

    public Buku(String img, String penerbit, String autor, String desc) {
        this.img = img;
        this.penerbit = penerbit;
        this.autor = autor;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
