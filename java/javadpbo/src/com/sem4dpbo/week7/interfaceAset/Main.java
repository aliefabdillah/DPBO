package com.sem4dpbo.week7.interfaceAset;

public class Main {
    public static void main(String[] args) {
        Bangunan obangunan = new Bangunan();
        Gudang ogudang = new Gudang();

        obangunan.setKodeBangunan(1);
        obangunan.setPemilikBangunan("PT BAHAGIA SEJAHTERA");

        System.out.println(obangunan.getKodeBangunan());
        System.out.println(obangunan.getPemilikBangunan());

//        instansiasi gudang
        ogudang.setKodeAset(111);
        ogudang.setJenisAset("Bangunan");
        ogudang.setNilaiAset(150000000);
        ogudang.setKodeGudang(100);
        ogudang.setNamaGudang("Gudang Roko");
        ogudang.setAlamatGudang("Bandung");

        System.out.println(ogudang.getKodeAset());
        System.out.println(ogudang.getJenisAset());
        System.out.println(ogudang.getNilaiAset());
        System.out.println(ogudang.getKodeGudang());
        System.out.println(ogudang.getNamaGudang());
        System.out.println(ogudang.getAlamatGudang());
    }
}
