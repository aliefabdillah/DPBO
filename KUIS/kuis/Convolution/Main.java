package kuis.Convolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner declaration
        Scanner scan = new Scanner(System.in);

        //input for lenght row and coloumn
        int row = 0;
        int col = 0;
        try {
            row = scan.nextInt();
            col = scan.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        //declaration matrix
        Integer[][] matrix = new Integer[row][col];     //for input
        Integer[][] result = new Integer[row][col];     //for result
        int temp;       //variable for result the count frome element


        //input row and column
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // counting elemetn and neighbour element
        //using try catch to define error
        try {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // baris awal
                    if (i == 0){
                        //awal
                        if (j == 0){
                            temp = matrix[i][j] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        // ujung
                        else if (j == col-1){
                            temp = matrix[i][j] + matrix[i][j-1] + matrix[i+1][j-1] + matrix[i+1][j];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        //tengah
                        else{
                            temp = matrix[i][j] + matrix[i][j-1] + matrix[i][j+1] + matrix[i+1][j-1] + matrix[i+1][j] + matrix[i+1][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                    }
                    //baris akhir
                    else if (i == row-1){
                        //awal
                        if (j == 0){
                            temp = matrix[i][j] + matrix[i-1][j] + matrix[i-1][j+1] + matrix[i][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        //ujung
                        else if (j == col-1){
                            temp = matrix[i][j] + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i][j-1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        //tengah
                        else {
                            temp = matrix[i][j] + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i-1][j+1] + matrix[i][j-1] + matrix[i][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                    }
                    //baris tengah
                    else{
                        //colom aawal
                        if(j == 0){
                            temp = matrix[i][j] + matrix[i-1][j] + matrix[i-1][j+1] + matrix[i][j+1] + matrix[i+1][j] + matrix[i+1][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        //colom akhir
                        else if(j == col-1){
                            temp = matrix[i][j] + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i][j-1] + matrix[i+1][j-1] + matrix[i+1][j];
                            result[i][j] = temp;
                            temp = 0;
                        }
                        //colom tengah
                        else{
                            temp = matrix[i][j] + matrix[i-1][j-1] + matrix[i-1][j] + matrix[i-1][j+1] + matrix[i][j-1] + matrix[i][j+1] + matrix[i+1][j-1] + matrix[i+1][j] + matrix[i+1][j+1];
                            result[i][j] = temp;
                            temp = 0;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());         //get message array index out of bound error exception
        }


        //print result matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j != col-1){
                    System.out.print(result[i][j] + " ");
                }
                else {
                    System.out.print(result[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
