package com.sem4dpbo.week1.contohkasus;

public class Balok {
    private int panjang;        //properties panjang balok
    private int lebar;          //proeprties lebar balok
    private int tinggi;          //properties tinggi balok

    //constructor kosong
    Balok(){
    }

    //construtor dengan parameter isian
    Balok(int p, int l, int t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    //prosedur get
    public int getPanjang(){
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    int getTinggi() {
        return tinggi;
    }

    //prosedur set
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    //fungsi menghitung volume
    public int volume(){
        return panjang*lebar*tinggi;
    }

    //fungsi mengihitung luas permukaan
    public int luasPermukaan(){
        return (2*panjang*lebar)+(2*lebar*tinggi)+(2*tinggi*panjang);
    }

}
