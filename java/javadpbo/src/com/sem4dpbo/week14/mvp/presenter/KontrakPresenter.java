/************************************
 * Filename : KontrakPresenter.java
 * Programmer : Alief Muhammad Abdillah
 * Date : 2022-05-10
 * Email : aliefmabdillah09@upi.edu
 * deskripsi : packgage presenter interface untuk memproses data dan diberikan dari model ke view
 ***********************************/
package com.sem4dpbo.week14.mvp.presenter;

public interface KontrakPresenter {
    public void prosesDataPengguna();
    public String getId(int i);
    public String getNama(int i);
    public String getUsername(int i);
    public String getTelepon(int i);
    public int getSize();
}
