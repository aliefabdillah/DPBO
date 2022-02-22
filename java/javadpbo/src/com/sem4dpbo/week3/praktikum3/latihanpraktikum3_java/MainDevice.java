package com.sem4dpbo.week3.praktikum3.latihanpraktikum3_java;

public class MainDevice {
    public static void main(String[] args) {
        // class processor
        Processor dataProc = new Processor("Intel", 3200000);

        //class disk
        Disk dataDisk = new Disk("SSD", "256 GB", 800000L);

        // class ram
        Ram dataRam = new Ram("16 GB", 1200000L);

        // class pc
        PC dataPc = new PC(dataProc, dataDisk, dataRam);

        // menampilkan hasil akhir
        dataPc.countTotal();
        dataPc.printPc();
    }
}
