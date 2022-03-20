package com.sem4dpbo.week7.abstrakTitik;

public class Titik3D extends Titik{
//    kelas turunan titik
    private int z;      //kordinat x

//    constructor
    Titik3D(){
        z = 0;
    }

    Titik3D(int xp, int yp, int zp) {
        setX(xp);
        setY(yp);
        z = zp;
    }

//  setter and getter
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

//    implementasi method abstract
    @Override
    public void printTitik() {
        System.out.println("Nilai X: " + getX());
        System.out.println("Nilai Y: " + getY());
        System.out.println("Nilai Z: " + getZ());
    }
}
