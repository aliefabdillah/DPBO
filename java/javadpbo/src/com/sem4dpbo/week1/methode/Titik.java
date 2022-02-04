package com.sem4dpbo.week1.methode;

public class Titik {
    private int x;          //koodinat x
    private int y;          //koordinat y

    //constructor 1
    Titik(){
        x = 0;
        y = 0;
    }

    //constructor 2
    Titik(int xp, int yp){
        this.x = xp;
        this.y = yp;
    }

    //fungsi set
    public void setX(int xp){
        x = xp;
    }

    public void setY(int yp){
        y = yp;
    }

    //fungsi get
    int getX(){
        return x;
    }

    int getY(){
        return y;
    }
}
