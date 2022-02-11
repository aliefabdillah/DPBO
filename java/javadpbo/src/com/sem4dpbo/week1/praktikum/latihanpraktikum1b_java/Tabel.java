package com.sem4dpbo.week1.praktikum.latihanpraktikum1b_java;

public class Tabel {
    private int baris, kolom;

    Tabel() {
    }

    Tabel(int b, int k) {
        this.baris = b;
        this.kolom = k;
    }

    public void setBarisKolom(int baris, int kolom) {
        this.baris = baris;
        this.kolom = kolom;
    }

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
