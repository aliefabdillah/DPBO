package com.sem4dpbo.week1.array;

import java.util.Scanner;

public class CobaArrayString {
    public static void main(String[] args) {
        //deklrasi array string
        String[] arr = new String[5];       //harus memasukan ukuran array saat deklrasi
        arr[0] = "Satu";

        System.out.println("Isi Array ke-1 adalah " + arr[0]);

        //jika menggunakan perulangan
        Scanner scan = new Scanner(System.in);

        int i;  //iterator
        //memasukan array dengan for loop
        for (i = 0; i<5; i++){
            arr[i] = scan.nextLine();
            System.out.println("isi Array ke: "+ i + " adalah " + arr[i]);
        }
    }
}
