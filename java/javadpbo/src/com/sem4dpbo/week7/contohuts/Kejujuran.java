package com.sem4dpbo.week7.contohuts;

public class Kejujuran extends Sifat{
    private Impact objImpact;
    private int reward;
    private int tahun;

    public Kejujuran(String kodeSifat, String nama,  int reward, int tahun){
        this.setNamaSifat(nama);
        this.setKodeSifat(kodeSifat);
        this.reward = reward;
        this.tahun = tahun;
    }

//    @Override
//    public void setKodeSifat(String kodeSifat) {
//        super.setKodeSifat(kodeSifat);
//    }
//
//    @Override
//    public void setNamaSifat(String namaSifat) {
//        super.setNamaSifat(namaSifat);
//    }

    public void setObjImpact(Impact objImpact) {
        this.objImpact = objImpact;
    }

    public Impact getObjImpact() {
        return objImpact;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void cek(){
        System.out.println(getKodeSifat());
        System.out.println(getNamaSifat());
        this.objImpact.cekImpact();
    }
}

