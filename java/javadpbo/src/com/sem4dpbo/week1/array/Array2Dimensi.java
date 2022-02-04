package com.sem4dpbo.week1.array;

import java.util.Scanner;

public class Array2Dimensi {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];

        Scanner input = new Scanner(System.in);

        int i,j;
        for (i=0; i < arr.length; i++){
            for (j=0; j<arr[i].length; j++){
                arr[i][j] = input.nextInt();
                System.out.println(arr[i][j]);
            }
        }
    }

}
