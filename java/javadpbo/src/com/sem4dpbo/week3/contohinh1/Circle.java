package com.sem4dpbo.week3.contohinh1;

public class Circle {
//    private instace variable
    private double radius;
    private String color;

//    constructor
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

//    public getter and setter method for every atribut
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

//  mengembalikan nilai String
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + '}';
    }

//    mengembalikan nilai luas lingkaran
    public double getArea(){
        return radius * radius * Math.PI;
    }


}
