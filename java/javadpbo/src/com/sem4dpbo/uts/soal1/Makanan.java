package com.sem4dpbo.uts.soal1;

public class Makanan {
    private String kodeMakanan;
    private String namaMakanan;
    private String kandunganGizi;
    private String jenisMakanan;
    private String noIjinPabrik;

//    contructor
    public Makanan(){}

    public Makanan(String kode, String namaMakanan, String kandunganGizi, String jenisMakanan, String noIjinPabrik) {
        this.kodeMakanan = kode;
        this.namaMakanan = namaMakanan;
        this.kandunganGizi = kandunganGizi;
        this.jenisMakanan = jenisMakanan;
        this.noIjinPabrik = noIjinPabrik;
    }

//    geetter and sett kode makanan
    public String getKodeMakanan() {
        return kodeMakanan;
    }

    public void setKodeMakanan(String kodeMakanan) {
        this.kodeMakanan = kodeMakanan;
    }

//    getter and setter nama makanan
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

//    getter and setter kandungan gizi
    public String getKandunganGizi() {
        return kandunganGizi;
    }

    public void setKandunganGizi(String kandunganGizi) {
        this.kandunganGizi = kandunganGizi;
    }

//    getter and setter jenis makanan
    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

//    getter and setter no ijin pabrik
    public String getNoIjinPabrik() {
        return noIjinPabrik;
    }

    public void setNoIjinPabrik(String noIjinPabrik) {
        this.noIjinPabrik = noIjinPabrik;
    }

    public void printMakanan(){
        System.out.println("- Kode : " + getKodeMakanan());
        System.out.println("- Nama : " + getNamaMakanan());
        System.out.println("- Jenis : " + getJenisMakanan());
        System.out.println("- Kandungan Gizi : " + getKandunganGizi());
        System.out.println("- No ijin Pabrik : " + getNoIjinPabrik());
    }
}
