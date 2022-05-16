/************************************
 * Filename : ProsesPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk controller untuk proses yang terkait dengan pengguna
 ***********************************/
package com.sem4dpbo.week13.mvc.controller;

import com.sem4dpbo.week13.mvc.model.Pengguna;

public class ProsesPengguna {
    private String hasil;           //hasil mengambil data
    private String error;           //erorr yang terjadi

    public ProsesPengguna(){
        //konstruktor
    }

    public void prosesDataPengguna(){
        try {
            //mengambil data di tabel pengguna dengan mengakses model pengguna
            Pengguna pengguna = new Pengguna();
            pengguna.getPengguna();
            hasil = "*********************************************\n";
            while (pengguna.getResult().next()){
                //ambil hasil query
                String id = pengguna.getResult().getString(1);
                String nama = pengguna.getResult().getString(2);
                String username = pengguna.getResult().getString(3);
                String telepon = pengguna.getResult().getString(4);

                //proses hasil
                hasil = hasil + "id: " + id + "\n";
                hasil = hasil + "nama: " + nama + "\n";
                hasil = hasil + "username: " + username + "\n";
                hasil = hasil + "telepon: " + telepon + "\n";
                hasil = hasil + "*********************************************\n";

            }

            //tutup koneksi
            pengguna.closeResult();
            pengguna.closeConnection();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String getHasil(){
        //mengembalikan hasil
        return this.hasil;
    }

    public String getError(){
        //mengembalikan error
        return this.error;
    }


}
