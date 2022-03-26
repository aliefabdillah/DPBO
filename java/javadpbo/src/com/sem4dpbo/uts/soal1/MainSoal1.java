package com.sem4dpbo.uts.soal1;

import java.util.Objects;
import java.util.Scanner;

/*"""
Janji: Saya Alief Muhammad Abdillah 2003623 mengerjakan UTS dalam mata kuliah Desain Pemrogaman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin
"""*/

public class MainSoal1 {
    public static void main(String[] args) {

//        instansiasi object makanan
        Makanan[] objMakanan = new Makanan[3];

//        input data makanan
        objMakanan[0] = new Makanan();
        objMakanan[0].setKodeMakanan("MKN001");
        objMakanan[0].setNamaMakanan("Nugget");
        objMakanan[0].setKandunganGizi("Protein");
        objMakanan[0].setJenisMakanan("Makanan Pendamping");
        objMakanan[0].setNoIjinPabrik("PBRK001");

        objMakanan[1] = new Makanan();
        objMakanan[1].setKodeMakanan("MKN002");
        objMakanan[1].setNamaMakanan("Kentang");
        objMakanan[1].setKandunganGizi("Karbohidrat");
        objMakanan[1].setJenisMakanan("Makanan Pokok");
        objMakanan[1].setNoIjinPabrik("PBRK002");

        objMakanan[2] = new Makanan();
        objMakanan[2].setKodeMakanan("MKN003");
        objMakanan[2].setNamaMakanan("Sereal");
        objMakanan[2].setKandunganGizi("Karbohidrat");
        objMakanan[2].setJenisMakanan("Makanan Pokok");
        objMakanan[2].setNoIjinPabrik("PBRK001");

        //        method prind data Makanan
        System.out.println("================");
        System.out.println("  Data Minuman  ");
        System.out.println("================");

        for (int i = 0; i < 3; i++) {
            objMakanan[i].printMakanan();
            System.out.println("------------------");
        }

//        instansiasi object minuman
        Minuman[] objMinuman = new Minuman[3];

        objMinuman[0] = new Minuman();
        objMinuman[0].setKodeMinuman("MNMN001");
        objMinuman[0].setNamaMinuman("Frutang");
        objMinuman[0].setKandunganGula(30);
        objMinuman[0].setJenisMinuman("Buah");
        objMinuman[0].setNoIjinPabrik("PBRK002");

        objMinuman[1] = new Minuman();
        objMinuman[1].setKodeMinuman("MNMN002");
        objMinuman[1].setNamaMinuman("Pocari Sweat");
        objMinuman[1].setKandunganGula(10);
        objMinuman[1].setJenisMinuman("Suplemen");
        objMinuman[1].setNoIjinPabrik("PBRK002");

        objMinuman[2] = new Minuman();
        objMinuman[2].setKodeMinuman("MNMN003");
        objMinuman[2].setNamaMinuman("Le Mineral");
        objMinuman[2].setKandunganGula(0);
        objMinuman[2].setJenisMinuman("Air Bersih");
        objMinuman[2].setNoIjinPabrik("PBRK002");

        //        method prind data Minuman
        System.out.println("================");
        System.out.println("  Data Minuman  ");
        System.out.println("================");

        for (int i = 0; i < 3; i++) {
            objMinuman[i].printMinuman();
            System.out.println("------------------");
        }

//        instansiasi object obat
        Obat[] objObat = new Obat[3];

        objObat[0] = new Obat();
        objObat[0].setKodeObat("OBT001");
        objObat[0].setNamaObat("Parasetamol");
        objObat[0].setJenisObat("Umum");
        objObat[0].setDosisPerHari(2);
        objObat[0].setBentuk("Tablet");
        objObat[0].setPenyakit("Sakit kepala");
        objObat[0].setNoIjinPabrik("PBRK003");

        objObat[1] = new Obat();
        objObat[1].setKodeObat("OBT002");
        objObat[1].setNamaObat("Tramadol");
        objObat[1].setJenisObat("Generik");
        objObat[1].setDosisPerHari(1);
        objObat[1].setBentuk("Kapsul");
        objObat[1].setPenyakit("Batuk");
        objObat[1].setNoIjinPabrik("PBRK003");

        objObat[2] = new Obat();
        objObat[2].setKodeObat("OBT003");
        objObat[2].setNamaObat("Sanmol");
        objObat[2].setJenisObat("Resep Dokter");
        objObat[2].setDosisPerHari(3);
        objObat[2].setBentuk("Sirup");
        objObat[2].setPenyakit("Pilek");
        objObat[2].setNoIjinPabrik("PBRK003");

//        method prind data obat
        System.out.println("===============");
        System.out.println("   Data Obat   ");
        System.out.println("===============");

        for (int i = 0; i < 3; i++) {
            objObat[i].printObat();
            System.out.println("------------------");
        }

//        prosedur mencari data makanan/minuman/obat yang pada data
        Scanner scan = new Scanner(System.in);
        String findData = null;
        System.out.print("Masukan data makanan/minuman/obat yang akan dicari: ");       //input masukan data yang akan dicari
        try {
            findData = scan.next();
        }catch (Exception e){}

//        pengecekan setiap data pada setiap object
        int cek = 0;
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(findData, objMakanan[i].getNamaMakanan()) || Objects.equals(findData, objMakanan[i].getKodeMakanan())) {
                System.out.println("Makanan:");
                objMakanan[i].printMakanan();
                cek = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(Objects.equals(findData, objMinuman[i].getNamaMinuman()) || Objects.equals(findData, objMinuman[i].getKodeMinuman())){
                System.out.println("Minuman:");
                objMinuman[i].printMinuman();
                cek = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            if(Objects.equals(findData, objObat[i].getNamaObat()) || Objects.equals(findData, objObat[i].getKodeObat())){
                System.out.println("Obat:");
                objObat[i].printObat();
                cek = 1;
            }
        }

//        jika cek == 0 maka data tidak ditemukan
        if (cek == 0){
                System.out.println("Nama yang dicari tidak ada pada data");
        }

    }
}
