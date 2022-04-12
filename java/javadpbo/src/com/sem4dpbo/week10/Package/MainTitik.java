package com.sem4dpbo.week10.Package;

import com.sem4dpbo.week10.Package.contohtitik.Titik3D;

public class MainTitik {
//    metode main untuk mengetes antarmuka TItik dan kelas Titik3D

    public static void main(String[] args) {
        Titik3D t = new Titik3D(0, 0, 7);
        t.setX(28);
        t.setY(1);

        t.printTitik();

        System.out.println("===================");
    }
}
