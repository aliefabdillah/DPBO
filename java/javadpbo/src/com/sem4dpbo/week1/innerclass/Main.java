package com.sem4dpbo.week1.innerclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 0;
        int x = 0;
        int y = 0;

        //deklrasi object cal dari class Calculator
        Calculator cal = new Calculator();


        System.out.println("Masukan Menu");
        //masukan menu dari user, menggunakan class Scanner
        Scanner input = new Scanner(System.in);
        try {
            //nextInt berarti masukan berupa Integer
            menu = input.nextInt();
        } catch (Exception ignored) {
        }

        //masukan x
        System.out.println("Masukan X");
        try {
            x = input.nextInt();
        } catch (Exception ignored){
        }

        //masukan y
        System.out.println("Masukan Y");
        try {
            y = input.nextInt();
        } catch (Exception ignored){
        }

        //menu switch case
        switch (menu){
            case 1:
                System.out.println(cal.getOpr().tambah(x, y));
                break;
            case 2:
                System.out.println(cal.getOpr().kurang(x,y));
                break;
            case 3:
                System.out.println(cal.getOpr().kali(x,y));
                break;
            case 4:
                System.out.println(cal.getOpr().bagi(x,y));
                break;
            default:
                System.out.println("Masukan Tidak Valid");
        }
    }
}
