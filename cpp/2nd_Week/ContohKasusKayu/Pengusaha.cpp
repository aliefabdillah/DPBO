#include <iostream>
#include <string>

using namespace std;

class Pengusaha
{
    private:
        /* data */
        int nomorUsaha;
        string nama, alamat, namaUsaha;

    public:
        Pengusaha(){};

        Pengusaha(string nama, string alamat, string namaUsaha, int nomorUsaha){
            this->nomorUsaha = nomorUsaha;
            this->nama = nama;
            this->alamat = alamat;
            this->namaUsaha = namaUsaha;
        }
// set method
        void setNomorUsaha(int nomorUsaha) {
            this->nomorUsaha = nomorUsaha;
        }

        void setNamaPengusaha(string nama) {
            this->nama = nama;
        }

        void setAlamat(string alamat) {
            this->alamat = alamat;
        }

        void setNamaUsaha(string namaUsaha) {
            this->namaUsaha = namaUsaha;
        }

// get method
        int getNomorUsaha() {
            return nomorUsaha;
        }

        string getNama() {
            return nama;
        }

        string getAlamat() {
            return alamat;
        }

        string getNamaUsaha() {
            return namaUsaha;
        }

        ~Pengusaha(){};

};
