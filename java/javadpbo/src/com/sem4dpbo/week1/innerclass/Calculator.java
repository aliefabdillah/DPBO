package com.sem4dpbo.week1.innerclass;

/*
Inner Class ini hanya terdapat pada Pemrogamana Java
Innerclas dapat mengakses apapun yang ada di outer class dan juga sebaliknya
*/

public class Calculator {
    private Operasi opr;

    Calculator(){
        opr = new Operasi();
    }

    Operasi getOpr(){
        return opr;
    }

    //inner class operasi
    static class Operasi {
        Operasi() {
        }

        //fungsi tambah
        int tambah(int x, int y) {
            return x + y;
        }

        //fungsi kurang
        int kurang(int x, int y) {
            return x - y;
        }

        int kali(int x, int y) {
            return x * y;
        }

        int bagi(int x, int y) {
            if (y > 0) {
                return x / y;
            } else {
                return -999999;
            }
        }
    }
}
