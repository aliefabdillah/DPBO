package com.sem4dpbo.week1.marimencoba;

public class DataNasabah {
    private String nama;
    private int saldo;
    private String transaki_terakhir;

    DataNasabah(){}

    DataNasabah(String nama, int saldo, String last_transaksi){
        this.nama = nama;
        this.saldo = saldo;
        this.transaki_terakhir = last_transaksi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTransaki_terakhir(String transaki_terakhir) {
        this.transaki_terakhir = transaki_terakhir;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getTransaki_terakhir() {
        return transaki_terakhir;
    }
}
