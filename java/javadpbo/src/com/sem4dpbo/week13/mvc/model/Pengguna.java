/************************************
 * Filename : Pengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk mengakses tabel pengguna
 ***********************************/
package com.sem4dpbo.week13.mvc.model;

//import konektor
import java.sql.SQLException;

public class Pengguna extends DB{
    private String id;          //id pengguna
    private String nama;        //nama pengguna
    private String username;    //username pengguna
    private String telepon;    //nomor telepon pengguna

    public Pengguna() throws Exception, SQLException {
//        konstruktor
        super();
    }

    public void getPengguna(){
//        mengeksekusi query untuk mengambil semua data pada tabel pengguna
        try {
            String query = "SELECT * FROM pengguna";
            createQuery(query);
        } catch (Exception e) {
            //tampilkan kesalahan
            System.out.println(e.toString());
        }
    }
}
