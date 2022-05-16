/************************************
 * Filename : TampilPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk menampilkan tampilan
 ***********************************/
package com.sem4dpbo.week14.mvp.view;

import java.util.ArrayList;
import com.sem4dpbo.week14.mvp.presenter.ProsesPengguna;

public class TampilPengguna implements KontrakView{

    private final ProsesPengguna prosesPengguna;      //presenter yang dapat berinteraksi langsung dengan view

    public TampilPengguna(){
        prosesPengguna = new ProsesPengguna();
    }

    public void tampil(){
        //menampilkan hasil tampilan
        try {
            prosesPengguna.prosesDataPengguna();
            String hasil = "";

            //semua terkait tampilan adalah tanggunag jawab view
            for (int i = 0; i < prosesPengguna.getSize(); i++) {
                hasil = hasil + "id: " + prosesPengguna.getId(i) + "\n";
                hasil = hasil + "nama: " + prosesPengguna.getNama(i) + "\n";
                hasil = hasil + "username: " + prosesPengguna.getUsername(i) + "\n";
                hasil = hasil + "telepon: " + prosesPengguna.getTelepon(i) + "\n";
            }

            System.out.println("*********************************************\n");
            System.out.println(hasil);
        }catch (Exception ex){
            //menampilkan error
            System.out.println(prosesPengguna.getError());
        }
    }
}
