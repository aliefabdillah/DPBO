package com.sem4dpbo.week7.abstrakTitik;

public class MainTitik {
    public static void main(String[] args) {
//        class abstrack tidak bisa di instansiasi
        Titik3D t = new Titik3D(0, 0, 7);

        t.setX(29);
        t.setY(1);
        t.printTitik();

        System.out.println("==============");
        Titik t1;           //class abstract dapat di inisialisasi
        t1 = t;             //tapi hanya untuk menampung object dari class anak

        t1.printTitik();
    }
}
