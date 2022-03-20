package com.sem4dpbo.week7.interfaceBangunDatar;

public class MainBangunDatar {
    public static void main(String[] args) {
//        intansiasinya hanya pada class saja karena interface tidak bisa di running
        Persegi opersegi;
        SegitigaSiku osegitiga;

        opersegi = new Persegi();
        osegitiga = new SegitigaSiku();

        System.out.println(opersegi.luas(5,8));
        System.out.println(osegitiga.luas(5,8));
    }
}
