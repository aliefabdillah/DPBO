/************************************
 * Filename : TampilPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk menampilkan tampilan
 ***********************************/
package com.sem4dpbo.week13.mvc.view;

import com.sem4dpbo.week13.mvc.controller.ProsesPengguna;

public class TampilPengguna {
    public TampilPengguna(){
        //kontruktor
    }

    public void tampil(){
        //menampilkan hasil tampilan
        ProsesPengguna ppengguna = new ProsesPengguna();
        try {
            ppengguna.prosesDataPengguna();
            System.out.println(ppengguna.getHasil());
        }catch (Exception ex){
            //menampilkan error
            System.out.println(ppengguna.getError());
        }
    }
}
