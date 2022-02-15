package com.sem4dpbo.week3.marimencoba3;

//inidividual class
public class Arsitek {
    private String kodeArsitek, namaArsitek, kantor, tahunBekerja;

//    constructor
    public Arsitek(){}

//    set dan get method
        //set method
    public void setKodeArsitek(String kodeArsitek) {
        this.kodeArsitek = kodeArsitek;
    }

    public void setNamaArsitek(String namaArsitek) {
        this.namaArsitek = namaArsitek;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public void setTahunBekerja(String tahunBekerja) {
        this.tahunBekerja = tahunBekerja;
    }

        //get method
    public String getKodeArsitek() {
        return kodeArsitek;
    }

    public String getNamaArsitek() {
        return namaArsitek;
    }

    public String getKantor() {
        return kantor;
    }

    public String getTahunBekerja() {
        return tahunBekerja;
    }
}
