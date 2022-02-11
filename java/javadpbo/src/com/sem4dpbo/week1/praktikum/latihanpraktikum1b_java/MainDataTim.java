package com.sem4dpbo.week1.praktikum.latihanpraktikum1b_java;

import java.util.Scanner;

public class MainDataTim {
    public static void main(String[] args) {
        int i, j;
        int n = 0, m = 0;
        Scanner scan = new Scanner(System.in);

        //input jumlah data dari user
        try {
            System.out.print("Masukan Jumlah Data Tim: ");
            n = scan.nextInt();
        } catch (Exception e) {
        }

        //deklarsi penampung sementara data tim
        String nama = null, negara = null, kota = null, kandang = null, tahunBerdiri = null;

//        objek array data tim
        DataTim[] arrData = new DataTim[0];

        for (i = 0; i < n; i++) {
            //masukan data
            try {
                System.out.println("Masukan Nama, Negara, Kota, Kandang, dan Tahun Berdiri Tim ke-"+(i+1)+":");
                nama = scan.next();
                negara = scan.next();
                kota = scan.next();
                kandang = scan.next();
                tahunBerdiri = scan.next();
            } catch (Exception e) {
            }

            //masukan jumlah pemain
            System.out.print("Masukan Jumlah Pemain Tim "+ nama +": ");
            try {
                m = scan.nextInt();
            } catch (Exception e) {
            }

            //masukan nama dan nomor punggung pemain
            String namaPemain = null;
            int nomor = 0;
            arrData = new DataTim[m];           //deklarasi array dari class DataTim dengan panjang m
            for (j = 0; j < m; j++) {
                try {
                    System.out.print("Masukan Nama dan Nomor Punggung Pemain ke-" + (j + 1) + ": ");
                    namaPemain = scan.next();
                    nomor = scan.nextInt();
                } catch (Exception e) {
                }

                //memasukan data masukan ke dalam objek
                arrData[j] = new DataTim(nama, negara, kota, kandang, tahunBerdiri, namaPemain, nomor);
            }

            //print data tim
            Tabel tabelTim = new Tabel(n, 4);
            System.out.println("Klub No."+(i+1)+":");
            String[] arrDataTimStr = new String[5];
            //memasukan data yang ada pada object ke dalam array of string
            arrDataTimStr[0] = arrData[i].getNama();
            arrDataTimStr[1] = arrData[i].getNegara();
            arrDataTimStr[2] = arrData[i].getKota();
            arrDataTimStr[3] = arrData[i].getKandang();
            arrDataTimStr[4] = arrData[i].getTahunBerdiri();
            tabelTim.buatBaris(arrDataTimStr, 4);               //membuat tabel

            //print daftar pemain
            System.out.println("Daftar Pemain:");
            Tabel tabelPemain = new Tabel(m, 4);
            for (int l = 0; l < m; l++) {
                String[] arrDataPemainStr = new String[2];
                arrDataPemainStr[0] = arrData[l].getPemain();
                arrDataPemainStr[1] = "" + arrData[l].getNomorPunggung();
                tabelPemain.buatBaris(arrDataPemainStr, 4);
            }
        }
    }
}
