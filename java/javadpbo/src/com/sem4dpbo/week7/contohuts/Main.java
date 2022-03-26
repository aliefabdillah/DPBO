package com.sem4dpbo.week7.contohuts;

public class Main {
    public static void main(String[] args) {

        Impact impactKecurangan = new Impact(2026, "IMP002", "Mati", false);
        Kecurangan objKecurangan = new Kecurangan("SFT001","CURANG", 100, 2020);
        objKecurangan.setObjImpact(impactKecurangan);

        Impact impactKejujuran = new Impact(2025, "IMP001", "Sukses", true);
        Kejujuran objKejujuran = new Kejujuran("SFT002", "JUJUR", 20000, 2021);
        objKejujuran.setObjImpact(impactKejujuran);

        Sifat objSifat = new Sifat();
        objSifat.setKodeSifat(objKejujuran.getKodeSifat());
        objSifat.setNamaSifat(objKejujuran.getNamaSifat());

        Manusia objManusia = new Manusia("320111", "Abdul", "Bandung");
        objManusia.setObjSifat(objSifat);

        objManusia.cekSet();
        objKecurangan.cek();
    }
}
