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