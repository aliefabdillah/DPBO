package com.sem4dpbo.week1.array;

import java.awt.*;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        //deklarasi array class menggunakan kata kunci Point
        Point[] arrPoint = new Point[2];

        int i, x, y;

        Scanner scan = new Scanner(System.in);

        for (i = 0; i< arrPoint.length; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            arrPoint[i] = new Point(x, y);      //memasukan nilai x dan y ke arrPoint
            System.out.println("X: " + arrPoint[i].x + " dan Y: " + arrPoint[i].y);
        }
    }
}
