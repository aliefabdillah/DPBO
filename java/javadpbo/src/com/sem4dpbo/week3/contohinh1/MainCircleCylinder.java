package com.sem4dpbo.week3.contohinh1;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(7, "Blue");
        System.out.println("Luas Lingkaran adalah : " + circle.getArea());
        System.out.println("Deskripsi Lingkarangn adalah : " + circle.toString());
//        System.out.println(circle.getVolume());       //parent class tidak dapat memanggil method yang ada di child class

        Cylinder cylinder = new Cylinder(10);
        System.out.println("Volume Cylinder = " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
