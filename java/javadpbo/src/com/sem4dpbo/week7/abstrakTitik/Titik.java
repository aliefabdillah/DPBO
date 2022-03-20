package com.sem4dpbo.week7.abstrakTitik;

abstract class Titik {
//    kelas untuk implementasi sebuah tipe titik
    private int x;
    private int y;

//    contructor
    Titik(){
        x = 0;
        y = 0;
    }

    Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    setter and getter X
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

//    setter and getter y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//    method abstract yang hanya di deklarasikan pada class anak
    public abstract void printTitik();
}
