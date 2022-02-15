#include <iostream>
#include <string>

using namespace std;

class TokoBangunan {
    private:
        string kodeToko, NamaToko, alamatToko;

//    constructor
    public:
        TokoBangunan(){}

        //set dan get method

        //get and set Kode toko
        string getKodeToko() {
            return kodeToko;
        }

        void setKodeToko(string kodeToko) {
            this->kodeToko = kodeToko;
        }

        //get and set nama toko
        string getNamaToko() {
            return NamaToko;
        }

        void setNamaToko(string namaToko) {
            NamaToko = namaToko;
        }

        //get and set atribut alamat toko
        string getAlamatToko() {
            return alamatToko;
        }

        void setAlamatToko(string alamatToko) {
            this->alamatToko = alamatToko;
        }

        ~TokoBangunan(){};
};
