package com.sem4dpbo.week2.marimencoba;

import java.util.Scanner;

public class MainMariMencoba {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j,k;
        int n = 0, m1 = 0, m2 = 0;

        System.out.print("Masukan Jumlah Data : ");
        try {
            n = scan.nextInt();
        }catch (Exception e){}

        //deklrasi object
        IndustriKuliner[] industriKuliner = new IndustriKuliner[n];
        PengusahaRestoran[] pengusahaRestoran = new PengusahaRestoran[n];
        Restoran[] restoran = new Restoran[n];

        MasakanIndonesia[] masakanIndonesia = new MasakanIndonesia[m1];
        BahanIkan[] bahanIkanLokal = new BahanIkan[m1];

        MasakanAsing[] masakanAsing = new MasakanAsing[m2];
        BahanIkan[] bahanIkanAsing = new BahanIkan[m2];

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
                industriKuliner[i] = new IndustriKuliner();
                industriKuliner[i].setNoIjin(noIjin);
                industriKuliner[i].setNamaPemilik(namaPemilik);
                industriKuliner[i].setNoIjin(kota);
                industriKuliner[i].setDeskripsi(deskripsi);
            }catch (Exception e){}


            //input user untuk class pengusaha restoran
            String namaRestoran = null, kodeRestoran = null;
            System.out.println("Masukan data pengusaha restoran (nama restoran, kodeRestoran):");
            try {
                namaRestoran = scan.next();
                kodeRestoran = scan.next();

                //memasukan data ke dalam object
                pengusahaRestoran[i] = new PengusahaRestoran();
                pengusahaRestoran[i].setNamaRestoran(namaRestoran);
                pengusahaRestoran[i].setKodeRestoran(kodeRestoran);
                pengusahaRestoran[i].setNamaPemilik(industriKuliner[i].getNamaPemilik());
                pengusahaRestoran[i].setKota(industriKuliner[i].getKota());
            }catch (Exception e){}


            //input user untuk class restoran
            String jenis = null, pangsaPasar = null;
            System.out.println("Masukan data restoran (jenis restoran, pangsaPasar):");
            try {
                jenis = scan.next();
                pangsaPasar = scan.next();

                //memasukan data input ke dalam object
                restoran[i] = new Restoran();
                restoran[i].setNamaRestoran(pengusahaRestoran[i].getNamaRestoran());
                restoran[i].setJenisRestoran(jenis);
                restoran[i].setPangsaPasar(pangsaPasar);
            }catch (Exception e){}

            //masukan jumlah masakan indoneisa dan masakan asing
            try {
                System.out.print("Jumlah masakan lokal di restoran " + (i+1) +" :");
                m1= scan.nextInt();
            }catch (Exception e){}

            masakanIndonesia = new MasakanIndonesia[m1];
            bahanIkanLokal = new BahanIkan[m1];

            //masukan user
            for (j = 0; j < m1; j++) {
                String kodeLokal = null, namaLokal = null, hargaLokal = null, kodeBahanLokal = null, bahanLokal = null, deskripsiBahanLokal = null;
                try {
                    System.out.println("Masukan kode, nama, harga, kode baha, bahan, dan deskripsi masakan lokal:");
                    kodeLokal = scan.next();
                    namaLokal = scan.next();
                    hargaLokal = scan.next();
                    kodeBahanLokal = scan.next();
                    bahanLokal = scan.next();
                    deskripsiBahanLokal = scan.next();

                    masakanIndonesia[j] = new MasakanIndonesia();
                    masakanIndonesia[j].setKodeMasakan(kodeLokal);
                    masakanIndonesia[j].setNama(namaLokal);
                    masakanIndonesia[j].setHarga(hargaLokal);
                    masakanIndonesia[j].setKodeBahan(kodeBahanLokal);
                    masakanIndonesia[j].setNamaBahan(bahanLokal);
                    masakanIndonesia[j].setDeskripsi(deskripsiBahanLokal);

                    //jika bahan berupa ikan
                    if (bahanLokal.equalsIgnoreCase("Ikan")){
                        String jenisIkan;
                        jenisIkan = scan.next();
                        bahanIkanLokal[j] = new BahanIkan();
                        bahanIkanLokal[j].setJenisIkan(jenisIkan);
                    }
                }catch (Exception e){}
            }


            //masukan jumlah masakan asing
            try {
                System.out.print("Jumlah masakan asing di restoran " + (i+1) +" :");
                m2= scan.nextInt();
            }catch (Exception e){}

            masakanAsing = new MasakanAsing[m2];
            bahanIkanAsing = new BahanIkan[m2];

            for (k = 0; k < m2; k++) {
                String kodeAsing = null, namaAsing = null, hargaAsing = null, kodeBahanAsing = null, bahanAsing = null, deskripsiBahanAsing = null;
                try {
                    System.out.println("Masukan kode, nama, harga, kode baha, bahan, dan deskripsi masakan asing:");
                    kodeAsing = scan.next();
                    namaAsing = scan.next();
                    hargaAsing = scan.next();
                    kodeBahanAsing = scan.next();
                    bahanAsing = scan.next();
                    deskripsiBahanAsing = scan.next();

                    masakanAsing[k] = new MasakanAsing();
                    masakanAsing[k].setKodeMasakan(kodeAsing);
                    masakanAsing[k].setNama(namaAsing);
                    masakanAsing[k].setHarga(hargaAsing);
                    masakanAsing[k].setKodeBahan(kodeBahanAsing);
                    masakanAsing[k].setNamaBahan(bahanAsing);
                    masakanAsing[k].setDeskripsi(deskripsiBahanAsing);

                    //jika bahan berupa ikan
                    if (bahanAsing.equalsIgnoreCase("Ikan")){
                        String jenisIkan;
                        jenisIkan = scan.next();
                        bahanIkanAsing[k] = new BahanIkan();
                        bahanIkanAsing[k].setJenisIkan(jenisIkan);
                    }
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
            System.out.println("Kode Restoran : "+pengusahaRestoran[i].getKodeRestoran());
            System.out.println("Nama Restoran : "+pengusahaRestoran[i].getNamaRestoran());
            System.out.println("Nama Pemiliki Restoran : "+pengusahaRestoran[i].getNamaPemilik());
            System.out.println("Kota Asal Restoran : "+pengusahaRestoran[i].getKota());
            System.out.println();
            System.out.println("Restoran");
            System.out.println("Nama Restoran : "+restoran[i].getNamaRestoran());
            System.out.println("jenis Restoran : "+restoran[i].getJenisRestoran());
            System.out.println("Pangsa Pasar : "+restoran[i].getPangsaPasar());
            System.out.println();

            //print masakan lokal/indonesia
            System.out.println("Daftar Masakan Indonesia");
            for (j = 0; j < m1; j++) {
                System.out.println("Kode Masakan : "+masakanIndonesia[j].getKodeMasakan());
                System.out.println("Nama Masakan : "+masakanIndonesia[j].getNama());
                System.out.println("Harga Masakan : "+masakanIndonesia[j].getHarga());
                System.out.println("Kode Bahan : "+masakanIndonesia[j].getKodeBahan());
                System.out.println("Nama Bahan : "+masakanIndonesia[j].getNamaBahan());
                System.out.println("Deskripsi Bahan : "+masakanIndonesia[j].getDeskripsi());
                if (masakanIndonesia[j].getNamaBahan().equalsIgnoreCase("Ikan")){
                    System.out.println("Jenis Ikan: "+bahanIkanLokal[j].getJenisIkan());
                }
                System.out.println("-------------------------------------");
            }

            //print masakan asing
            System.out.println("Daftar Masakan Asing:");
            for (k = 0; k < m2; k++) {
                System.out.println("Kode Masakan : "+masakanAsing[k].getKodeMasakan());
                System.out.println("Nama Masakan : "+masakanAsing[k].getNama());
                System.out.println("Harga Masakan : "+masakanAsing[k].getHarga());
                System.out.println("Kode Bahan : "+masakanAsing[k].getKodeBahan());
                System.out.println("Nama Bahan : "+masakanAsing[k].getNamaBahan());
                System.out.println("Deskripsi Bahan : "+masakanAsing[k].getDeskripsi());
                if (masakanAsing[k].getNamaBahan().equalsIgnoreCase("Ikan")){
                    System.out.println("Jenis Ikan: "+bahanIkanAsing[k].getJenisIkan());
                }
                System.out.println("-------------------------------------");
            }

            System.out.println();
            System.out.println("######################");
            System.out.println();
        }
    }
}
