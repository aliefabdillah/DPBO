package com.sem4dpbo.week2.praktikum2.singleinheritance;

//base class : Animal
class Animal{
    void actionEat(){
        System.out.println("Eating....");
    }
}

//derrived class/child class: Dog
class Dog extends Animal{
    void actionBark(){
        System.out.println("Barking.....");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();          //create object from derrived class
        System.out.print("The Dog is ");
        d.actionBark();             //call method from derrived class
        System.out.print("\nThe Dog is ");
        d.actionEat();              //call method from parent/base class
    }
}
