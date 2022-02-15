#include <iostream>
#include <string>

using namespace std;

class Manusia
{
    private:
        /* data */
        string nama, alamat, noKtp, Telepon;
    public:
        Manusia() {}
        string getNama() {
            return nama;
        }

        void setNama(string nama) {
            this->nama = nama;
        }

        string getAlamat() {
            return alamat;
        }

        void setAlamat(string alamat) {
            this->alamat = alamat;
        }

        string getNoKtp() {
            return noKtp;
        }

        void setNoKtp(string noKtp) {
            this->noKtp = noKtp;
        }

        string getTelepon() {
            return Telepon;
        }

        void setTelepon(string telepon) {
            this->Telepon = telepon;
        }

        ~Manusia() {}
};

class Arsitek: public Manusia{
    private:
        string kodeArsitek, kantor, tahunBekerja;

//    constructor
    public:
        Arsitek(){}

    //    set dan get method
            //set method
        void setKodeArsitek(string kodeArsitek) {
            this->kodeArsitek = kodeArsitek;
        }

        void setKantor(string kantor) {
            this->kantor = kantor;
        }

        void setTahunBekerja(string tahunBekerja) {
            this->tahunBekerja = tahunBekerja;
        }

            //get method
        string getKodeArsitek() {
            return kodeArsitek;
        }

        string getKantor() {
            return kantor;
        }

        string getTahunBekerja() {
            return tahunBekerja;
        }

        ~Arsitek(){};
};

class PenjualBahanBangunan: public Manusia {
    private:
        string namaToko, alamatToko;

//    constructor
    public:
        PenjualBahanBangunan(){}

    //    set and get method
        string getNamaToko() {
            return namaToko;
        }

        void setNamaToko(string namaToko) {
            this->namaToko = namaToko;
        }

        string getAlamatToko(){
            return alamatToko;
        }

        void setAlamatToko(string alamatToko){
            this->alamatToko = alamatToko;
        }

        ~PenjualBahanBangunan(){};
};