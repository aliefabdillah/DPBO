#include "Manusia.cpp"

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
