package com.sem4dpbo.week4.contohsoal3;



public class PenjualBahanBangunan {
    private String noKTP, Nama;     //nomor ktp dan nama penjual
    private int banyakToko;         //banyaknya toko yang dimiliki
    private TokoBangunan[] toko;    //toko milik penjual dari class TokoBangunan

    //konstruktor
    PenjualBahanBangunan(){}

    PenjualBahanBangunan(String noKTP, String nama, int banyakToko){
        this.noKTP = noKTP;
        this.Nama = nama;
        this.banyakToko = banyakToko;
        this.toko = new TokoBangunan[banyakToko];
    }

//  get and set noKTP
    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

//    get and set Nama
    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

//    get and set Banyak Toko
    public int getBanyakToko() {
        return banyakToko;
    }

    public void setBanyakToko(int banyakToko) {
        this.banyakToko = banyakToko;
    }

//   get and set Toko
    public TokoBangunan[] getToko() {
        return toko;
    }

    public void setToko(TokoBangunan toko, int nomorToko) {
        this.toko[nomorToko] = toko;
    }

//    prosedur menampilkan penjual dan toko
    void cetakPenjual(){
        //mencetak data penjual dan semua toko bahan banguna yang dimiliki
        System.out.println("---------------------------------------------");
        System.out.println("Nama Penjual   :" + Nama);
        System.out.println("No Ktp Penjual :" + noKTP);
        System.out.println("Toko Yang dimiliki: ");
        for (int i = 0; i < banyakToko; i++) {
            System.out.println(i);
            System.out.println("- Kode Toko : " + toko[i].getKodeToko());
            System.out.println("- Nama Toko : " + toko[i].getNamaToko());
            System.out.println("- Alamat Toko : " + toko[i].getAlamatToko());
        }
    }

//    prosedur menampilkan penjual dan toko tertentu
    void cetakPenjualToko(int i){
        //mencetak data penjual dan semua toko tertentu
        System.out.println("---------------------------------------------");
        System.out.println("Nama Penjual   :" + Nama);
        System.out.println("No Ktp Penjual :" + noKTP);
        System.out.println("Toko Yang dimiliki: ");

        System.out.println(i);
        System.out.println("- Kode Toko : " + toko[i].getKodeToko());
        System.out.println("- Nama Toko : " + toko[i].getNamaToko());
        System.out.println("- Alamat Toko : " + toko[i].getAlamatToko());
        System.out.println("---------------------------------------------");

    }

}
