package com.sem4dpbo.week1.praktikum.latihanpraktikum1b;

public class DataTim {
    //atribut untuk menampung data
    private String nama, negara, kota, kandang, tahunBerdiri, pemain;
    private int nomorPunggung;
    //constructor
    public DataTim(
            String nama, String negara, String kota, String kandang, String tahunBerdiri, String pemain,
            int nomorPunggung)
    {
        this.nama = nama;
        this.negara = negara;
        this.kota = kota;
        this.kandang = kandang;
        this.tahunBerdiri = tahunBerdiri;
        this.pemain = pemain;
        this.nomorPunggung = nomorPunggung;
    }

    //method setter
    public void setNama(String nama) { this.nama = nama;}

    public void setNegara(String negara) {this.negara = negara;}

    public void setKota(String kota) {this.kota = kota;}

    public void setKandang(String kandang) {this.kandang = kandang;}

    public void setTahunBerdiri(String tahunBerdiri) {this.tahunBerdiri = tahunBerdiri;}

    public void setPemain(String pemain) { this.pemain = pemain; }

    public void setNomorPunggung(int nomorPunggung) {this.nomorPunggung = nomorPunggung;}

    //method getter
    public String getNama() { return nama; }

    public String getNegara() { return negara; }

    public String getKota() { return kota; }

    public String getKandang() { return kandang; }

    public String getTahunBerdiri() { return tahunBerdiri;}

    public String getPemain() { return pemain; }

    public int getNomorPunggung() {return nomorPunggung;}

}
