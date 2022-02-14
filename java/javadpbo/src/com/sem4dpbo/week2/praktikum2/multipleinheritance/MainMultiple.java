package com.sem4dpbo.week2.praktikum2.multipleinheritance;

//parent class A
class A{
    public void printA(){
        System.out.println("Software Testing Help ");
    }
}

//child class / derived class
class B extends A{
    public void printB(){
        System.out.println("Java Series ");
    }
}

class C extends B{
    public void printC(){
        System.out.println("Tutorials");
    }
}

public class MainMultiple {
    public static void main(String[] args) {
        C obj_c = new C();       //create Class C object
        obj_c.printA();     //call grandparent method
        obj_c.printB();     //call parent class method
        obj_c.printC();     //call member method
    }
}
