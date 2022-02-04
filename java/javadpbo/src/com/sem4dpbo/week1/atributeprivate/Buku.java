package com.sem4dpbo.week1.atributeprivate;

public class Buku {
    public String judul;
    private String pengarang;

    //constructor kosong
    Buku(){
    }

    //constructor dengan properties
    Buku(String j, String p){
        //kata kunci this untuk mengakses properties yang ada di pada class
        this.judul = j;
        this.pengarang = p;
    }

    //method setter
    void setJudul(String j){
        this.judul = j;
    }

    void setPengarang(String p){
        this.pengarang = p;
    }

    //method getter
    String getJudul(){
        return this.judul;
    }

    String getPengarang(){
        return this.pengarang;
    }
}
