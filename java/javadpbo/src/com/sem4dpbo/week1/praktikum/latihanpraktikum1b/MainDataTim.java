package com.sem4dpbo.week1.praktikum.latihanpraktikum1b;

import java.util.Scanner;

public class MainDataTim {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int n = 0;
        Scanner scan = new Scanner(System.in);

        //input jumlah data dari user
        try {
            System.out.print("Masukan Jumlah Data Tim:");
            n = scan.nextInt();
        } catch (Exception e) {
        }

        //deklarsi penampung sementara data tim
        String nama = null, negara = null, kota = null, kandang = null, tahunBerdiri = null;

//        objek array data tim
        DataTim[] arrDataTim = new DataTim[n];
        //masukan datatim
        for (i = 0; i < n; i++) {
            try {
                System.out.println("Masukan Nama, Negara, Kota, Kandang, dan Tahun Berdiri Tim:");
                nama = scan.next();
                negara = scan.next();
                kota = scan.next();
                kandang = scan.next();
                tahunBerdiri = scan.next();
            } catch (Exception e) {
            }

//            arrDataTim[i] = new DataTim(nama, negara, kota, kandang, tahunBerdiri);
        }

        //deklarasi objek array data pemain
//        DataTim[] dataPemain;
//        DataTim.buatDanPrintArrayPemain(arrDataTim, n);

        //print data tim
        Tabel tabelTim = new Tabel(n, 5);
        for (i = 0; i < n; i++) {
            String[] arrDataTimStr = new String[5];
            //memasukan data yang ada pada object ke dalam array of string
            arrDataTimStr[0] = arrDataTim[i].getNama();
            arrDataTimStr[1] = arrDataTim[i].getNegara();
            arrDataTimStr[2] = arrDataTim[i].getKota();
            arrDataTimStr[3] = arrDataTim[i].getKandang();
            arrDataTimStr[4] = arrDataTim[i].getTahunBerdiri();
            tabelTim.buatBaris(arrDataTimStr, 5);               //membuat tabel
        }

        int m = 0;
        System.out.print("Masukan Jumlah Pemain Tim :");
        try {
            m = scan.nextInt();
        } catch (Exception e) {
        }

        DataTim[] pemain = new DataTim[m];
        for (i = 0; i < n; i++) {
            //masukan jumlah pemain dari tim
            String namaPemain = null;
            //masukan nama pemain
            for (j = 0; j < m; j++) {
                try {
                    System.out.print("Masukan Nama Pemain ke-" + (j + 1) + ": ");
                    namaPemain = scan.next();
                } catch (Exception e) {
                }

//                pemain[i] = new DataTim(namaPemain);
            }
        }

        for (int k = 0; k < m; k++) {
            System.out.println(pemain[i]);
        }

//        System.out.println("Daftar Pemain:");
//        Tabel tabelPemain = new Tabel(m, 1);
//        for (i = 0; i < m; i++) {
//            String[] arrDataPemainStr = new String[1];
//            arrDataPemainStr[0] = pemain[i].getPemain();
//            tabelPemain.buatBaris(arrDataPemainStr, 1);
//        }
    }

}
