#include "BahanBangunan.cpp"

class Semen: public BahanBangunan {
    private:
        string namaSemen, kodePabrik, kualitas, harga;

//    constructor
    public:
        Semen(){}

//    set and get emthod
    string getNamaSemen() {
        return namaSemen;
    }

    void setNamaSemen(string namaSemen) {
        this->namaSemen = namaSemen;
    }

    string getKodePabrik() {
        return kodePabrik;
    }

    void setKodePabrik(string kodePabrik) {
        this->kodePabrik = kodePabrik;
    }

    string getKualitas() {
        return kualitas;
    }

    void setKualitas(string kualitas) {
        this->kualitas = kualitas;
    }

    string getHarga() {
        return harga;
    }

    void setHarga(string harga) {
        this->harga = harga;
    }

    ~Semen(){};
};
