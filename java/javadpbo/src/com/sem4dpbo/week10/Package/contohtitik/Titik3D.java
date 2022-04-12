package com.sem4dpbo.week10.Package.contohtitik;

public class Titik3D implements Titik{
    private int x;
    private int y;
    private int z;

//    konstruktor1
    public Titik3D(){
        x = 0;
        y = 0;
        z = 0;
    }
//    konstruktor 2
    public Titik3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void setX(int xp) {
        x = xp;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int yp) {
        y = yp;
    }

    @Override
    public int getY() {
        return y;
    }


    public int getZ() {
        return z;
    }

    public void setZ(int zp) {
        z = zp;
    }

    @Override
    public void printTitik() {
        System.out.println("Nilai X : " + getX());
        System.out.println("Nilai Y : " + getY());
        System.out.println("Nilai Z : " + getZ());
    }
}
