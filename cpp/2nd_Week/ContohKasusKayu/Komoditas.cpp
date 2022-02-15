#include <iostream>
#include <string>

using namespace std;

class Komoditas{

    private:
        string negaraTujuan, jenisKomoditas, kodeKomoditas;
    public:
        Komoditas(){};

        void setNegaraTujuan(string negaraTujuan) {
            this->negaraTujuan = negaraTujuan;
        }

        void setJenisKomoditas(string jenisKomoditas) {
            this->jenisKomoditas = jenisKomoditas;
        }

        void setKodeKomoditas(string kodeKomoditas) {
            this->kodeKomoditas = kodeKomoditas;
        }

        string getNegaraTujuan() {
            return this->negaraTujuan;
        }
        string getJenisKomoditas() {
            return this->jenisKomoditas;
        }
        string getKodeKomoditas() {
            return this->kodeKomoditas;
        }

        ~Komoditas(){};
};
