package com.sem4dpbo.uts.soal2;

import java.util.Random;

public class Coin extends GameTool{
    private String namaDivisi;

//    constructor
    public Coin(){}
    public Coin(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    @Override
    public Boolean isResultEqual(int val) {
        return val == generateResult();
    }

    @Override
    public int generateResult() {
        Random random = new Random();
        int number = 2;                     //random number from 0-1
        return random.nextInt(number);
    }

    @Override
    public String convertResultToString(int result) {
        if (result == 0){
            return "head";
        }
        else{
            return "tail";
        }
    }

    public Boolean isNResultContainHead(int n){
        int nResult = 0;
        for (int i = 0; i < n; i++) {
            nResult = generateResult();
        }

        if (nResult == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean sNResultsAreAllHead(int n){
        int[] nResult = new int[n];

        int i = 0;
        int stop = 0;
        do {
            nResult[i] = generateResult();
            if (nResult[i] == 0){
                i++;
            }
            else {
                stop = 1;
            }
        }while (i < n);

        if (stop == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
