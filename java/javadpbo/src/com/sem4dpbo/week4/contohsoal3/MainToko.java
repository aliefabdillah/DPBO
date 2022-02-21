package com.sem4dpbo.week4.contohsoal3;

import java.util.Scanner;

public class MainToko {
    public static void main(String[] args) {
        String cari = "";    //string oencarian
        PenjualBahanBangunan[] penjual;         //array penjual bahan bangunan
        penjual = new PenjualBahanBangunan[3];

//        pengisian penjual bahan bangunan dan toko
        penjual[0] = new PenjualBahanBangunan("001", "Ida Jubaedah", 2);
        penjual[0].setToko(new TokoBangunan("t001", "Sejahtera Abadi", "Parompong Ngamprah"), 0);
        penjual[0].setToko(new TokoBangunan("t002", "Bahagia Abadi", "Lembang"), 1);

        penjual[1] = new PenjualBahanBangunan("002", "Maman Suhedi", 3);
        penjual[1].setToko(new TokoBangunan("t003", "Makmur Abadi", "Cimahi Utara"), 0);
        penjual[1].setToko(new TokoBangunan("t004", "Jaya Sejahtera", "Cimahi Utara"), 1);
        penjual[1].setToko(new TokoBangunan("t005", "Jaya Indah", "Cimahi Utara"), 2);

        penjual[2] = new PenjualBahanBangunan("003", "Tina Surahman", 1);
        penjual[2].setToko(new TokoBangunan("t006", "Laris Jaya", "Cimahi Utara"), 0);

        //menampilkan semua data yang telah di isi
        System.out.println("Daftar Penjual Beserta Toko");
        for (int i = 0; i < penjual.length; i++) {
            penjual[i].cetakPenjual();
        }

        //meminta masukan berupa nama toko
        System.out.println("Nama Toko Yang dicari: ");
        Scanner scanf = new Scanner(System.in);

        try {
            cari = scanf.next();
        }catch (Exception e){}

        //menampilkan hasil pencarian
        System.out.println("Hasil Pencarian : ");
        for (int i = 0; i < penjual.length; i++) {
            for (int j = 0; j < penjual[i].getToko().length; j++) {
                if (penjual[i].getToko()[j].getNamaToko().matches("(.*)" + cari + "(.*)")){
                    penjual[i].cetakPenjualToko(j);
                }
            }
        }
    }
}
