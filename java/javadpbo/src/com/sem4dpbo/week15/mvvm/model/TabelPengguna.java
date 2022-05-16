/************************************
 * Filename : TabelPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk mengakses tabel pengguna
 ***********************************/
package com.sem4dpbo.week15.mvvm.model;

//import konektor
import com.sem4dpbo.week15.mvvm.model.DB;

import java.sql.SQLException;

public class TabelPengguna extends DB {
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
