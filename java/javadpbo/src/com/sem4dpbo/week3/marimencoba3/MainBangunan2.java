package com.sem4dpbo.week3.marimencoba3;

public class MainBangunan2 {
    public static void main(String[] args) {
        Arsitek dataArsitek = new Arsitek();     // intansiasi class arsitek

//        memasukan data ke dalam object arsitek
        dataArsitek.setKodeArsitek("A1");
        dataArsitek.setNamaArsitek("Rendy");
        dataArsitek.setKantor("Podomoro Group");
        dataArsitek.setTahunBekerja("2021");

//        TokoBangunan dataToko = new TokoBangunan();     //instansiasi object data toko menggunakan class Toko

        //memasukan data ke dalam objcet dataPenjual memakai inheritance

        Manusia dataManusia = new Manusia();       //instansiasi class penjual bahan Bangunan
        dataManusia.setKodeToko("TK01");
        dataManusia.setNamaToko("PD Sumber Makmur");
        dataManusia.setAlamatToko("Jalan Setiabudi");
        dataManusia.setNoKtp("3204280012");
        dataManusia.setNamaPenjual("Hj. Asep");
        dataManusia.setTelepon("08122319288");

        Semen dataSemen = new Semen();
        dataSemen.setKodeBahan("SMN01");
        dataSemen.setKategoriJenisBahan("Semen");
        dataSemen.setNamaSemen("Semen Tiga Roda");
        dataSemen.setKodePabrik("PB001");
        dataSemen.setKualitas("Sangat Baik");
        dataSemen.setHarga("40K/sak");


//        print data
        System.out.println("Data");
        System.out.println("===============");
        System.out.println("Arsitek");
        System.out.println("---------------");
        System.out.println("Kode: "+dataArsitek.getKodeArsitek());
        System.out.println("Nama: "+dataArsitek.getNamaArsitek());
        System.out.println("Kantor: "+dataArsitek.getKantor());
        System.out.println("Tahun bekerja: "+dataArsitek.getTahunBekerja());
        System.out.println("---------------");
        System.out.println("Toko Bangunan");
        System.out.println("---------------");
        System.out.println("Kode Toko: "+dataManusia.getKodeToko());
        System.out.println("Nama Toko: "+dataManusia.getNamaToko());
        System.out.println("Alamat Toko: "+dataManusia.getAlamatToko());
        System.out.println("---------------");
        System.out.println("Penjual Bahan Bangunan");
        System.out.println("---------------");
        System.out.println("Kode Toko: "+dataManusia.getKodeToko());
        System.out.println("Nama Toko: "+dataManusia.getNamaToko());
        System.out.println("Alamat Toko: "+dataManusia.getAlamatToko());
        System.out.println("No KTP: "+dataManusia.getNoKtp());
        System.out.println("Nama Penjual: "+dataManusia.getNamaPenjual());
        System.out.println("No Telepon: "+dataManusia.getTelepon());
        System.out.println("---------------");
        System.out.println("Bahan Bangunan");
        System.out.println("---------------");
        System.out.println("1. Semen");
        System.out.println("   - KodeBahan : "+dataSemen.getKodeBahan());
        System.out.println("   - Kategori Jenis Bahan : "+dataSemen.getKategoriJenisBahan());
        System.out.println("   - Nama : "+dataSemen.getNamaSemen());
        System.out.println("   - Kode Pabrik : "+dataSemen.getKodePabrik());
        System.out.println("   - Kualitas : "+dataSemen.getKualitas());
        System.out.println("   - Harga : "+dataSemen.getHarga());
    }
}
