/************************************
 * Filename : Main.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : progaram utama
 ***********************************/

package com.sem4dpbo.week13.mvc;
import com.sem4dpbo.week13.mvc.view.TampilPengguna;
public class Main {
    public static void main(String[] args) {
        //memanggil modul view
        TampilPengguna tampilPengguna = new TampilPengguna();
        tampilPengguna.tampil();
    }
}
