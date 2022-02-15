package com.sem4dpbo.week3.marimencoba2;

public class MainBangunan {
    public static void main(String[] args) {
        Arsitek dataArsitek = new Arsitek();     // intansiasi class arsitek

//        memasukan data ke dalam object arsitek
        dataArsitek.setKodeArsitek("A1");
        dataArsitek.setNamaArsitek("Rendy");
        dataArsitek.setKantor("Podomoro Group");
        dataArsitek.setTahunBekerja("2021");

        TokoBangunan dataToko = new TokoBangunan();     //instansiasi object data toko menggunakan class Toko
        dataToko.setKodeToko("TK01");
        dataToko.setNamaToko("PD Sumber Makmur");
        dataToko.setAlamatToko("Jalan Setiabudi");

        //memasukan data ke dalam objcet dataPenjual
        PenjualBahanBangunan dataPenjual = new PenjualBahanBangunan();       //instansiasi class penjual bahan Bangunan
        dataPenjual.setNoKtp("3204280012");
        dataPenjual.setNamaPenjual("Hj. Asep");
        dataPenjual.setNamaToko("PD Sumber Makmur");
        dataPenjual.setAlamatToko("Jalan Setiabudi");

        // memasukan data ke dalam object data semen
        Semen dataSemen = new Semen();
        dataSemen.setKodeBahan("SMN01");
        dataSemen.setKategoriJenisBahan("Semen");
        dataSemen.setNamaSemen("Semen Tiga Roda");
        dataSemen.setKodePabrik("PB001");
        dataSemen.setKualitas("Sangat Baik");       //call method setKualitas dari parent class dataSemen, yaitu class bahanBangunan
        dataSemen.setHarga("40K/sak");          //call method setHarga dari parent class dataSemen, yaitu class bahanBangunan

        Genteng dataGenteng = new Genteng();
        dataGenteng.setKodeBahan("GNT01");
        dataGenteng.setKategoriJenisBahan("tanah liat");
        dataGenteng.setNamaGenteng("Genteng Garuda");
        dataGenteng.setKodePabrik("PB012");
        dataGenteng.setKualitas("Baik");
        dataGenteng.setHarga("1K/buah");

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
        System.out.println("Kode Toko: "+dataToko.getKodeToko());
        System.out.println("Nama Toko: "+dataToko.getNamaToko());
        System.out.println("Alamat Toko: "+dataToko.getAlamatToko());
        System.out.println("---------------");
        System.out.println("Penjual Bahan Bangunan");
        System.out.println("---------------");
        System.out.println("No KTP: "+dataPenjual.getNoKtp());
        System.out.println("Nama Penjual: "+dataPenjual.getNamaPenjual());
        System.out.println("Nama Toko: "+dataPenjual.getNamaToko());
        System.out.println("Alamat Toko: "+dataPenjual.getAlamatToko());
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
        System.out.println("2. Genteng");
        System.out.println("   - KodeBahan : "+dataGenteng.getKodeBahan());
        System.out.println("   - Kategori Jenis Bahan : "+dataGenteng.getKategoriJenisBahan());
        System.out.println("   - Nama : "+dataGenteng.getNamaGenteng());
        System.out.println("   - Kode Pabrik : "+dataGenteng.getKodePabrik());
        System.out.println("   - Kualitas : "+dataGenteng.getKualitas());
        System.out.println("   - Harga : "+dataGenteng.getHarga());
    }
}
