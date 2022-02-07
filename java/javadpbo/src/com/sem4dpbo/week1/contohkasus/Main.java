package com.sem4dpbo.week1.contohkasus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;      //deklarasi banyak balok
        System.out.println("Masukan Banyak Balok:");

        //input masukan
        Scanner scan = new Scanner(System.in);

        try {
            n = scan.nextInt();
        }catch (Exception e) {
        }

        Balok[] arrBalok = new Balok[n];        //deklarasi array balok

        //mengisi array balok
        int i=0, p=0, l=0, t=0;

        for (i = 0; i < n; i++) {
            System.out.println("Masukan panjang, lebar, dan tinggi balok ke " + (i+1) + " :");
            try {
                p = scan.nextInt();
            }catch (Exception e){
            }

            try {
                l = scan.nextInt();
            }catch (Exception e){
            }

            try {
                t = scan.nextInt();
            }catch (Exception e){
            }

            arrBalok[i] = new Balok(p, l, t);
        }

        //menampilkan array balok
        Tabel tab = new Tabel(n, 5);

        for (i = 0; i < n; i++) {
            String[] arrStr = new String[5];
            arrStr[0] = "" + arrBalok[i].getPanjang();
            arrStr[1] = "" + arrBalok[i].getLebar();
            arrStr[2] = "" + arrBalok[i].getTinggi();
            arrStr[3] = "" + arrBalok[i].volume();
            arrStr[4] = "" + arrBalok[i].luasPermukaan();
            tab.buatBaris(arrStr, 5);
        }
    }
}
