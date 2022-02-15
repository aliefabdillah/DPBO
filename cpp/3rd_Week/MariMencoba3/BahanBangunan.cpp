#include <iostream>
#include <string>

using namespace std;

class BahanBangunan {
    private: string kodeBahan, kategoriJenisBahan;

//    constructor
    public:
        BahanBangunan(){}

    //    set and get method
        string getKodeBahan() {
            return kodeBahan;
        }

        void setKodeBahan(string kodeBahan) {
            this->kodeBahan = kodeBahan;
        }

        string getKategoriJenisBahan() {
            return kategoriJenisBahan;
        }

        void setKategoriJenisBahan(string kategoriJenisBahan) {
            this->kategoriJenisBahan = kategoriJenisBahan;
        }

        ~BahanBangunan(){}
};
