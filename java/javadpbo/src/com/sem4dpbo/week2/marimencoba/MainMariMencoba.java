package com.sem4dpbo.week2.marimencoba;

import java.util.Scanner;

public class MainMariMencoba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,k;
        int n = 0, m = 0, m2 = 0;

        System.out.print("Masukan Jumlah Data : ");
        try {
            n = scan.nextInt();
        }catch (Exception e){}

        //deklrasi object
        Restoran[] industriKuliner = new Restoran[n];
        PengusahaRestoran[] pengusahaRestoran = new PengusahaRestoran[n];

        Masakan[] masakan = new Masakan[m];

        //masukan
        for (i = 0; i < n; i++) {
            //input user untuk class IndustriKuliner
            String namaPemilik = null, noIjin = null, deskripsi = null, kota = null;
            System.out.println("Masukan data industri kuliner (noIjin, namaPemiliki, kota, deskripsi):");
            try {
                noIjin = scan.next();
                namaPemilik = scan.next();
                kota = scan.next();
                deskripsi = scan.next();

                //memasukan data ke dalam object
                industriKuliner[i] = new Restoran();
                industriKuliner[i].setNoIjin(noIjin);
                industriKuliner[i].setNamaPemilik(namaPemilik);
                industriKuliner[i].setKota(kota);
                industriKuliner[i].setDeskripsi(deskripsi);
            }catch (Exception e){}

            //input user untuk class restoran
            String jenis = null, pangsaPasar = null;
            System.out.println("Masukan data restoran (jenis restoran, pangsaPasar):");
            try {
                jenis = scan.next();
                pangsaPasar = scan.next();

                //memasukan data input ke dalam object
                industriKuliner[i].setJenisRestoran(jenis);
                industriKuliner[i].setPangsaPasar(pangsaPasar);
            }catch (Exception e){}

            //input user untuk class pengusaha restoran
            String namaRestoran = null, kodeRestoran = null, kodePengusaha = null, kotaPengusaha = null;
            System.out.println("Masukan data pengusaha restoran (kode Pengusaha, nama restoran, kota pengusaha, kode restoran):");
            try {
                kodePengusaha = scan.next();
                namaRestoran = scan.next();
                kotaPengusaha = scan.next();
                kodeRestoran = scan.next();

                //memasukan data ke dalam object
                pengusahaRestoran[i] = new PengusahaRestoran();
                pengusahaRestoran[i].setKodePengusaha(kodePengusaha);
                pengusahaRestoran[i].setNamaRestoran(namaRestoran);
                pengusahaRestoran[i].setKotaPengusaha(kotaPengusaha);
                pengusahaRestoran[i].setKodeRestoran(kodeRestoran);
            }catch (Exception e){}


            //masukan jumlah masakan indoneisa dan masakan asing
            try {
                System.out.print("Jumlah masakan di restoran " + (i+1) +" :");
                m= scan.nextInt();
            }catch (Exception e){}

            masakan = new Masakan[m];
//            bahanMasakan = new BahanMasakan[m];

            //masukan user
            for (j = 0; j < m; j++) {
                String kodeMasakan = null, namaMasakan = null, hargaMasakan = null, negaraMasakan = null;
                try {
                    System.out.println("Masukan kode, namaMasakan, hargaMasakan, negaraMasakan:");
                    kodeMasakan = scan.next();
                    namaMasakan = scan.next();
                    hargaMasakan = scan.next();
                    negaraMasakan = scan.next();

                    masakan[j] = new Masakan();
                    masakan[j].setKodeMasakan(kodeMasakan);
                    masakan[j].setNama(namaMasakan);
                    masakan[j].setHarga(hargaMasakan);
                    masakan[j].setNegara(negaraMasakan);
                }catch (Exception e){}

                String kodeBahan = null, namaBahan = null, detailBahan = null, deskripsiBahan = null;
                try {
                    System.out.println("Masukan kode, nama, detail, deskripsi bahan:");
                    kodeBahan = scan.next();
                    namaBahan = scan.next();
                    detailBahan = scan.next();
                    deskripsiBahan = scan.next();

//                    bahanMasakan[j] = new Masakan();
                    masakan[j].setKodeBahan(kodeBahan);
                    masakan[j].setNamaBahan(namaBahan);
                    masakan[j].setDetailBahan(detailBahan);
                    masakan[j].setDeskripsi(deskripsiBahan);
                }catch (Exception e){}
            }
        }

        //print data
        for (i = 0; i < n; i++) {
            System.out.println("Data ke-"+(i+1)+" :");
            System.out.println("==============================");
            System.out.println("Industri Kuliner");
            System.out.println("No.Ijin : "+industriKuliner[i].getNoIjin());
            System.out.println("Nama Pemiliki Industri :" + industriKuliner[i].getNamaPemilik());
            System.out.println("Kota Industri :" + industriKuliner[i].getKota());
            System.out.println("Deskripsi Industri :" + industriKuliner[i].getDeskripsi());
            System.out.println();
            System.out.println("Pengusaha Restoran");
            System.out.println("Kode Pengusaha : "+pengusahaRestoran[i].getKodePengusaha());
            System.out.println("Nama Restoran : "+pengusahaRestoran[i].getNamaRestoran());
            System.out.println("Kota Asal Pengusaha : "+pengusahaRestoran[i].getKotaPengusaha());
            System.out.println("Kode Restoran : "+pengusahaRestoran[i].getKodeRestoran());
            System.out.println();
            System.out.println("Restoran");
            System.out.println("Nama Pemilik : "+industriKuliner[i].getNamaPemilik());
            System.out.println("Kota Restoran :" +industriKuliner[i].getKota());
            System.out.println("jenis Restoran : "+industriKuliner[i].getJenisRestoran());
            System.out.println("Pangsa Pasar : "+industriKuliner[i].getPangsaPasar());
            System.out.println();

            //print masakan lokal/indonesia
            System.out.println("Daftar Masakan dan Bahan");
            for (j = 0; j < m; j++) {
                System.out.println("Daftar Masakan");
                System.out.println("Kode Masakan : "+masakan[j].getKodeMasakan());
                System.out.println("Nama Masakan : "+masakan[j].getNama());
                System.out.println("Harga Masakan : "+masakan[j].getHarga());
                System.out.println("Negara Masakan : "+masakan[j].getNegara());
                System.out.println("Kode Bahan : "+masakan[j].getKodeBahan());
                System.out.println("Nama Bahan : "+masakan[j].getNamaBahan());
                System.out.println("Detail Bahan : "+masakan[j].getDetailBahan());
                System.out.println("Deskripsi Bahan : "+masakan[j].getDeskripsi());
                System.out.println("-------------------------------------");
            }

            System.out.println();
            System.out.println("######################");
            System.out.println();
        }
    }
}
