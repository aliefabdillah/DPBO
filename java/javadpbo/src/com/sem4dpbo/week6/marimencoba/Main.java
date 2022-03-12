package com.sem4dpbo.week6.marimencoba;

public class Main {
    public static void main(String[] args) {
//        /*
//        error
//        Ortu obj_ortu1 = new Ortu();
//        Anak b = obj_ortu;
//        */

//        tidak akan error
        Anak obj_anak = new Anak();
        Ortu obj_ortu = obj_anak;

        obj_ortu.tampilOrtu();
        obj_anak.tampilAnak();
        obj_anak.tampilOrtu();
    }
}
