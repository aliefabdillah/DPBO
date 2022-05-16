/************************************
 * Filename : TabelPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk mengakses tabel pengguna
 ***********************************/
package com.sem4dpbo.week14.mvp.model;

//import konektor
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TabelPengguna extends DB{
    public TabelPengguna() throws Exception, SQLException{
        //kontruktor
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
