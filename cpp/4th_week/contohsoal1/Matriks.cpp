#include <iostream>
#include <string>

using namespace std;

class Matriks
{
private:
    /* data */
    int baris;
    int kolom;
    int mat[50][50];
public:
    // konstruktor
    Matriks() {}
    Matriks(int baris, int kolom) {
        this->baris = baris;
        this->kolom = kolom;
        mat[baris][kolom];
    }

    // set and get baris
    void setBaris(int baris) {
        this->baris = baris;
    }

    int getBaris() {
        return baris;
    }

    //set and get kolom
    void setKolom(int kolom) {
        this->kolom = kolom;
    }

    int getKolom() {
        return kolom;
    }

    void setMat(int baris, int kolom) {
        mat[baris][kolom];
    }

    int getMat() {
        return mat[baris][kolom];
    }

    //  set and get sel
    void setSel(int baris, int kolom, int nilai){
        mat[baris][kolom] = nilai;
    }

    int getSel(int baris, int kolom) {
        return mat[baris][kolom];
    }

    ~Matriks() {}
};