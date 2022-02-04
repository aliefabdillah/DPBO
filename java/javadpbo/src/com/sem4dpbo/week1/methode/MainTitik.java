package com.sem4dpbo.week1.methode;

public class MainTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik(11, 9);

        t1.setX(10);
        t1.setY(15);

        System.out.println("t1: Nilai X: " + t1.getX());
        System.out.println("t1: Nilai Y: " + t1.getY());

        System.out.println("t2: Nilai X: " + t2.getX());
        System.out.println("t2: Nilai Y: " + t2.getY());

    }
}
