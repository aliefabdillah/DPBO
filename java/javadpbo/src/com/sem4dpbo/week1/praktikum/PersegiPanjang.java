package com.sem4dpbo.week1.praktikum;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

//    constructor
    public PersegiPanjang(int p, int l){
        this.panjang = p;
        this.lebar = l;
    }

    public PersegiPanjang(){}

//    method get and set

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int luas(){
        return panjang * lebar;
    }

    public int keliling(){
        return 2 * (panjang + lebar);
    }
}
