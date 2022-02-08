package com.sem4dpbo.week1.praktikum;

import java.util.Scanner;

public class MainPP {
    public static void main(String[] args) {
        int n = 0;

        PersegiPanjang rec1 = new PersegiPanjang();
        rec1.setLebar(3);
        rec1.setPanjang(6);

        PersegiPanjang rec2 = new PersegiPanjang(10,5);

        //input
        Scanner scan = new Scanner(System.in);
        try {
            n = scan.nextInt();
        }catch (Exception e){}

//      Objek berupa array
        PersegiPanjang[] arrRec = new PersegiPanjang[n];
        int  i , l = 0, p = 0;
        for (i = 0; i < n; i++) {
            //input panjang dan lebar
            try {
                p = scan.nextInt();
            }catch (Exception e){}

            try {
                l = scan.nextInt();
            }catch (Exception e){}

            //memasukan setiap data ke dalam objek
            arrRec[i] = new PersegiPanjang(p, l);
        }

        //menampilkan isi object
        System.out.println("Keliling Persegi 1 : " + rec1.keliling());
        System.out.println("luas Persegi 1 : " + rec1.luas());
        System.out.println("Keliling Persegi 2 : " + rec2.keliling());
        System.out.println("luas Persegi 2 : " + rec2.luas());

        for (i = 0; i < n; i++) {
            System.out.println("Keliling array persegi panjang ke " + (i+1) + " : " + arrRec[i].keliling());
            System.out.println("Luas array persegi panjang ke " + (i+1) + " : " + arrRec[i].luas());
        }
    }
}
