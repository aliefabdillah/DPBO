package com.sem4dpbo.week4.contohsoal1;

public class Matriks {
    private int baris;
    private int kolom;
    private int[][] mat;

    Matriks(){}

    Matriks(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
        mat = new int[baris][kolom];
    }

//    get and set baris
    public void setBaris(int baris) {
        this.baris = baris;
    }

    public int getBaris() {
        return baris;
    }

//    get and set kolom
    public void setKolom(int kolom) {
        this.kolom = kolom;
    }

    public int getKolom() {
        return kolom;
    }

//    get and set matriks
    public void setMat() {
        mat = new int[baris][kolom];
    }

    public int[][] getMat() {
        return mat;
    }

//    get and set sel
    public void setSel(int baris, int kolom, int nilai){
        mat[baris][kolom] = nilai;
    }

    public int getSel(int baris, int kolom){
        return mat[baris][kolom];
    }

}
