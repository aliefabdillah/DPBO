package com.sem4dpbo.week2.contohkasus;

import java.util.Scanner;

public class MainPohon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);          //masukan

        //masukan data pengusaha
        int n1 = 0;         //masukan panjang array class 1
        try {
            System.out.print("Masukan jumlah data pengusaha : ");
            n1 = scan.nextInt();
        }catch (Exception e){}

        int nomorUsaha = 0;
        String nama = null, alamat = null, namaUsaha = null;
        Pengusaha[] pengusaha = new Pengusaha[n1];
        for (int i = 0; i < n1; i++) {
            try {
                System.out.println("Masukan data nama, alamat, nama usaha, dan nomor usaha dari pengusaha ke-" + (i+1) +": ");
                nama = scan.next();
                alamat = scan.next();
                namaUsaha = scan.next();
                nomorUsaha = scan.nextInt();
            }catch (Exception e){}
            pengusaha[i] = new Pengusaha(nama, alamat, namaUsaha, nomorUsaha);
        }

        TabelPohon tabel = new TabelPohon(n1, 4);
        System.out.println("Tabel Data Pengusaha:");
        for (int i = 0; i < n1; i++) {
            String[] arrPengusaha = new String[4];
            arrPengusaha[0] = pengusaha[i].getNama();
            arrPengusaha[1] = pengusaha[i].getAlamat();
            arrPengusaha[2] = pengusaha[i].getNamaUsaha();
            arrPengusaha[3] ="" + pengusaha[i].getNomorUsaha();
            tabel.buatBaris(arrPengusaha, 4);
        }

    }
}
