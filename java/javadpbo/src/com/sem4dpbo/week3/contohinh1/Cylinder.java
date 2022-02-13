package com.sem4dpbo.week3.contohinh1;

/*
* Cylinder class adalah class yang sama dengan class lingkarangan
* tetapi ditambah atribut height
* */
public class Cylinder extends Circle {
//    implementarsi Cylinder class dengan parent dari class circle

    //private properties
    private double height;

//    constructor
    public Cylinder(){
        super();        //memakai superclass constructor dari class circle (radius dan color)
        this.height = 1.0;
    }

    public Cylinder(double height){
        super();                //memakai superclass constructor dari class circle (radius dan color)
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);          //mengganti radius yang ada di superclass constructor menjadi radius parameter dari constructor Cylinder
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);   //mengganti radius dan color yang ada di superclass constructor menjadi radius parameter dari constructor Cylinder
        this.height = height;
    }


//    get dan setter method pada cylinder
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

//    mengembalikan nilai volume cylinder
    public double getVolume(){
        return getArea()*height;            //menggunakan fungsi luas dikali tinggi
    }

//    mengembalikan self-descriptive string
    public String toString() {
        return "Ini adalah String";
    }
}
