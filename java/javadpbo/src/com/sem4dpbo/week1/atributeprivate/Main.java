package com.sem4dpbo.week1.atributeprivate;

public class Main {
    //deklrasi pada main
    public static void main(String[] args) {
        //membuat objek dari class Buku
        Buku b1;
        Buku b2;

        b1 = new Buku();     //menyimpan object di memory, dari class contructor tanpa parameter
        b1.setJudul("J2ME");
        b1.setPengarang("Orang_1");
        System.out.println(b1.getJudul());
        System.out.println(b1.getPengarang());

        //membuat object dari class constructor yang memiliki parameter
        b2 = new Buku("J3ME", "Orang_2");           //mengakses class di memory dengan kata kunci new
        System.out.println(b2.getJudul());
        System.out.println(b2.getPengarang());
    }
}
