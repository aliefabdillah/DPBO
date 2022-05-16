/************************************
 * Filename : DB.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : class untuk mengakses database
 ***********************************/

package com.sem4dpbo.week13.mvc.model;

//import konektor
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

//class DB
public class DB {
//    konfigurasi konekksi
    private String ConAddress = "jdbc:mysql://localhost:3306/mvc_test?user=root&password=";
    private Statement stmt = null;      //koneksi query
    private ResultSet rs = null;        //hasil query
    private Connection conn = null;     //koneksi Mysql dan database

    public DB() throws Exception, SQLException {
        /*
        * method DB
        * Konstruktor Melakukan koneksi mysql dan database
        * Menerima masukan berupa string alamat koneksi mysql dan database*/

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(ConAddress);
            conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);
        }catch (SQLException es){
            //mengeluarkan error jika gagal koneksi
            throw es;
        }
    }

    public void createQuery(String Query) throws Exception, SQLException{
        /*
        * method createQuery
        * mengeksekusi query tanpa mengubah isi data
        * menerima masukan berupa string query*/

        try {
            stmt = conn.createStatement();
            //eksekusi query
            rs = stmt.executeQuery(Query);
            if (stmt.execute(Query)){
//                ambil hasil query
                rs = stmt.getResultSet();
            }
        }catch (SQLException es){
//            tampilkan keluaran
            throw es;
        }
    }

    public void createUpdate(String Query) throws Exception, SQLException{
        /*
        * method create query
        * mengeksusi query yang mengubah isi data seperti update, insert, delete
        * menerima masukan berupa string query*/

        try {
            stmt = conn.createStatement();
            //ekseskusi query
            int hasil = stmt.executeUpdate(Query);
        }
        catch (SQLException es){
            //tampilkan error
            throw es;
        }
    }

    public ResultSet getResult() throws Exception{
        /*
        * metho getResult
        * memberikan hasil query*/

        ResultSet temp = null;
        try {
            return rs;
        }catch (Exception ex){
            //jika hasil tidak dapat di kembalikan
            return temp;
        }
    }

    public void closeResult() throws SQLException, Exception{
        /*
        * method close result
        * menutup hubungan dari eksekusi query*/
        if (rs != null){
            try {
                rs.close();
            }catch (SQLException sqlEx){
                rs = null;
                throw sqlEx;
            }
        }
        if (stmt != null){
            try {
                stmt.close();
            }catch (SQLException sqlEx){
                stmt = null;
                throw sqlEx;
            }
        }
    }

    public void closeConnection() throws SQLException, Exception{
        /*
        * methode closeConnection
        * menurup hubungan dengan MYSQL dan database*/
        if (conn != null){
            try {
                conn.close();
            }catch (SQLException sqlEx){
                conn = null;
            }
        }
    }
}

