/************************************
 * Filename : Pengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk menampung setiap data pengguna
 ***********************************/
package com.sem4dpbo.week15.mvvm.model;

public class Pengguna{
    private String id;          //id pengguna
    private String nama;        //nama pengguna
    private String username;    //username pengguna
    private String telepon;    //nomor telepon pengguna

    public Pengguna(){
//        konstruktor
    }

//    setter and getter for id
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

//    setter dan getter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//    setter dan getter untuk username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    setter dan getter untuk telepon
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
