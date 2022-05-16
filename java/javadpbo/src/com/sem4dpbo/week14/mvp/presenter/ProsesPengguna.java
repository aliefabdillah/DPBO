/************************************
 * Filename : ProsesPengguna.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : packge presenter untuk penengah antara view dan model tanpa terlibat hal-hal yang terkait format tampilan
 *              pada view
 ***********************************/
package com.sem4dpbo.week14.mvp.presenter;

import java.util.ArrayList;
import com.sem4dpbo.week14.mvp.model.TabelPengguna;
import com.sem4dpbo.week14.mvp.model.Pengguna;

public class ProsesPengguna implements KontrakPresenter{
    private String error;           //erorr yang terjadi
    private TabelPengguna tabelPengguna;        //kelas untuk mengakses query tabel pengguna
    private ArrayList<Pengguna> data;           //tempat menyimpan hasil query

    public ProsesPengguna(){
        //konstruktor
        try {
            tabelPengguna = new TabelPengguna();        //intansiasi TabelPengguna
            data = new ArrayList<Pengguna>();           //intansiasi list untuk data pengguna
        }catch (Exception e){
            error = e.toString();
        }
    }

    public void prosesDataPengguna(){
        try {
            //mengambil data di tabel pengguna
            tabelPengguna.getPengguna();
            while (tabelPengguna.getResult().next()){
                //ambil hasil query
                Pengguna pengguna = new Pengguna();         //intansiasi objek pnegguna untuk setiap data pengguna

                pengguna.setId(tabelPengguna.getResult().getString(1));
                pengguna.setNama(tabelPengguna.getResult().getString(2));
                pengguna.setUsername(tabelPengguna.getResult().getString(3));
                pengguna.setTelepon(tabelPengguna.getResult().getString(4));

                data.add(pengguna);         //tambahkan data pengguna ke dalam list
            }

            //tutup koneksi
            tabelPengguna.closeResult();
            tabelPengguna.closeConnection();
        } catch (Exception e) {
            error = e.toString();
        }
    }

    public String getId(int i){
        //mengembalikna id pengguna dengan indeks ke i
        return data.get(i).getId();
    }

    public String getNama(int i){
        //mengembalikna nama pengguna dengan indeks ke i
        return data.get(i).getNama();
    }

    public String getUsername(int i){
        //mengembalikna username pengguna dengan indeks ke i
        return data.get(i).getUsername();
    }

    public String getTelepon(int i){
        //mengembalikna telepon pengguna dengan indeks ke i
        return data.get(i).getTelepon();
    }

    public int getSize() {
        //mengembalikan banyaknya data pengguna ke dalam list
        return data.size();
    }

    public String getError(){
        //mengembalikan error
        return this.error;
    }


}
