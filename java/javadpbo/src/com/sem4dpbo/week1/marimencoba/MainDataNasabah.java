package com.sem4dpbo.week1.marimencoba;

import java.util.Scanner;

public class MainDataNasabah {
    public static void main(String[] args) {

        int n = 0, i = 0, j = 0;
        //input masukan
        System.out.print("Masukan Jumlah data Nasabah : ");
        Scanner scan = new Scanner(System.in);
        try {
            n = scan.nextInt();
        }catch (Exception e){}

        //deklarasi object berupa array
        DataNasabah[] arrData = new DataNasabah[n];

        //masukan array
        String nama = null, last_transaksi = null;
        int saldo = 0;

        for (i = 0; i < n; i++) {
            System.out.println("Masukan Nama, Saldo, dan Trasaksi Terakhir dari nasabah ke-" + (i+1) + " : ");
            try {
                nama = scan.next();
            }catch (Exception e){}

            try {
                saldo = scan.nextInt();
            }catch (Exception e){}

            try {
                last_transaksi = scan.nextLine();
            }catch (Exception e){}

            arrData[i] = new DataNasabah(nama, saldo, last_transaksi);
        }

        Tabel tabel = new Tabel(n,3);

        for (i = 0; i < n; i++) {
            String[] arrDataStr = new String[3];
            arrDataStr[0] = arrData[i].getNama();
            arrDataStr[1] = "" + arrData[i].getSaldo();
            arrDataStr[2] = arrData[i].getTransaki_terakhir();
            tabel.buatBaris(arrDataStr, 3);
        }
    }
}
