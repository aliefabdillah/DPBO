package com.sem4dpbo.week1.praktikum.latihanpraktikum1b;

import java.util.Scanner;

public class DataTim {
    private String nama, negara, kota, kandang, tahunBerdiri, pemain;
//    private static int m;
    static Scanner scan = new Scanner(System.in);

    //constructor
    public DataTim(
            String nama, String negara, String kota, String kandang, String tahunBerdiri, String pemain)
    {
        this.nama = nama;
        this.negara = negara;
        this.kota = kota;
        this.kandang = kandang;
        this.tahunBerdiri = tahunBerdiri;
        this.pemain = pemain;
    }

    //method setter
    public void setNama(String nama) { this.nama = nama;}

    public void setNegara(String negara) {this.negara = negara;}

    public void setKota(String kota) {this.kota = kota;}

    public void setKandang(String kandang) {this.kandang = kandang;}

    public void setTahunBerdiri(String tahunBerdiri) {this.tahunBerdiri = tahunBerdiri;}

    //method getter
    public String getNama() { return nama; }

    public String getNegara() { return negara; }

    public String getKota() { return kota; }

    public String getKandang() { return kandang; }

    public String getTahunBerdiri() { return tahunBerdiri;}

    public String getPemain() { return pemain; }

    //membuat array atribut pemain dari objek
    public static void buatDanPrintArrayPemain(DataTim[] arrDataTim, int n) {

    }
}
