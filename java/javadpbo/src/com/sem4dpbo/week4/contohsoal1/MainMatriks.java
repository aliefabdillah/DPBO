package com.sem4dpbo.week4.contohsoal1;

import java.util.Scanner;

public class MainMatriks {
    public static void main(String[] args) {
        int baris = 0, kolom = 0, i = 0, j = 0, temp = 0;
        Scanner scanf = new Scanner(System.in);

        //masukan baris
        System.out.println("Masukan baris");
        try {
            baris = scanf.nextInt();
        }catch (Exception e){}

        //masukan kolom
        System.out.println("Masukan Kolom");
        try {
            kolom = scanf.nextInt();
        }catch (Exception e){}

        //inisialiasi matriks
        Matriks m = new Matriks(baris, kolom);
        m.setMat();


        //mengisi matriks
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                System.out.println("Masukan Angka");
                try {
                    temp = scanf.nextInt();
                    m.setSel(i,j,temp);
                }catch (Exception e){}
            }
        }

        //menampilkan matriks
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                System.out.print(m.getSel(i, j) + " ");
            }
            System.out.println();
        }
    }
}
