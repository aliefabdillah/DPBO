package com.sem4dpbo.week2.contohkasus;

public class Kayu {
    private int kodeKayu, berat, volume;
    private String jenisPohon;

    Kayu(){}

    public void setKodeKayu(int kodeKayu) {
        this.kodeKayu = kodeKayu;
    }

    public void setJenisPohon(String jenisPohon) {
        this.jenisPohon = jenisPohon;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getKodeKayu() {
        return kodeKayu;
    }

    public String getJenisPohon() {
        return jenisPohon;
    }

    public int getBerat() {
        return berat;
    }

    public int getVolume() {
        return volume;
    }
}
