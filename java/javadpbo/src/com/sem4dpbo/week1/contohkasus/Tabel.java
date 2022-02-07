package com.sem4dpbo.week1.contohkasus;

public class Tabel {
    private int baris;      //banyak baris
    private int kolom;      //banyak kolom

    //constructor kosong
    Tabel(){
    }

    //constructor dengan parameter
    Tabel(int b, int k){
        this.baris = b;
        this.kolom = k;
    }

    //prosedur setBaris
    public void setBaris(int baris1, int kolom1){
        this.baris = baris1;
        this.kolom = kolom1;
    }

    //prosedur membuat baris
    public void buatBaris(String[] isi, int add) {
        //inisialisasi variabel
//        int i = 0, j = 0;

        //garis tabel bagian atas
        for (int i = 0; i < isi.length; i++) {
            for (int j = 0; j < (isi[i].length() + add); j++) {
                System.out.print("-");
            }
        }
        System.out.println("");

        //membuat baris isi
        for (int i = 0; i < isi.length; i++) {
            System.out.print("| ");
            System.out.print(isi[i]);
            for (int j = 0; j < (add - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println("");

        //garis tabel bagian bawah
        for (int i = 0; i < isi.length; i++) {
            for (int j = 0; j < (isi[i].length() + add); j++) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
