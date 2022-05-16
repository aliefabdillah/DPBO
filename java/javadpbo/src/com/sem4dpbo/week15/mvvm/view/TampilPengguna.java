/************************************
 * Filename : TampilPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk menampilkan tampilan
 ***********************************/
package com.sem4dpbo.week15.mvvm.view;

import com.sem4dpbo.week15.mvvm.viewmodel.ProsesPengguna;

public class TampilPengguna{

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
                hasil = hasil + "*********************************************\n";
            }
            System.out.println("*********************************************");
            System.out.println(hasil);
        }catch (Exception ex){
            //menampilkan error
            System.out.println(prosesPengguna.getError());
        }
    }
}
