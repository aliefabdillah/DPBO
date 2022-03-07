package com.sem4dpbo.week6.contohpolymorfism;

public class Main {
    public static void main(String[] args) {
        Buku obuku;
        obuku = new Buku();
        obuku.setBuku("PBO");
        System.out.println("Judul: " + obuku.getJudul());
        System.out.println("Tahun: " + obuku.getTahun());
        System.out.println("Pengarang: " + obuku.getPengarang());

        obuku.setBuku("PBO2", 2011);
        System.out.println("Judul: " + obuku.getJudul());
        System.out.println("Tahun: " + obuku.getTahun());
        System.out.println("Pengarang: " + obuku.getPengarang());
    }
}
