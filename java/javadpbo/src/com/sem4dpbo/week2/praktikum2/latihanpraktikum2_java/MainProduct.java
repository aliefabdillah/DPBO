package com.sem4dpbo.week2.praktikum2.latihanpraktikum2_java;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        //input masukan
        Scanner scan = new Scanner(System.in);

        //variabel-variabel
        int i;
        int n = 0;

        //masukan jumlah data
        try {
            System.out.print("Masukan jumlah data : ");
            n = scan.nextInt();
        }catch (Exception e){}

        Memory[] dataProduct3 = new Memory[n];          //deklarasi obcet dari class Memory

//        masukan data
        String idProduct = null, brand = null, model = null;
        int frequency = 0, memorySize = 0;
        long price = 0;
        boolean supportCuda = false;

        for (i = 0; i < n; i++) {
            try {
                //masukan data
                System.out.println("Masukan id dan harga product ke-"+(i+1)+":");
                idProduct = scan.next();
                price = scan.nextLong();
                System.out.println("Masukan brand dan model product ke-"+(i+1)+":");
                brand = scan.next();
                model = scan.next();
                System.out.println("Masukan memory frequency, memory size dan Cuda(true/false) product ke-"+(i+1)+":");
                frequency = scan.nextInt();
                memorySize = scan.nextInt();
                supportCuda = scan.nextBoolean();

            }catch (Exception e){}
                //memasukan data ke dalam object
            dataProduct3[i] = new Memory();
            dataProduct3[i].setIdProduct(idProduct);
            dataProduct3[i].setPrice(price);
            dataProduct3[i].setBrand(brand);
            dataProduct3[i].setModel(model);
            dataProduct3[i].setFrequency(frequency);
            dataProduct3[i].setMemorySize(memorySize);
            dataProduct3[i].setSupportsCuda(supportCuda);
            System.out.println("------------------------------------------");
        }

        dataProduct3[0].setIdProduct("111");
//        print data pada object
        for (i = 0; i < n; i++) {
            System.out.println("=============================================");
            System.out.println("Id Product   : "+dataProduct3[i].getIdProduct());
            System.out.println("Price        : "+dataProduct3[i].getPrice());
            System.out.println("Brand        : "+dataProduct3[i].getBrand());
            System.out.println("Model        : "+dataProduct3[i].getModel());
            System.out.println("Frequency    : "+dataProduct3[i].getFrequency());
            System.out.println("Memory Size  : "+dataProduct3[i].getMemorySize());
            System.out.println("Support Cuda : "+dataProduct3[i].isSupportsCuda());
        }
    }
}
