#include "HasilKerajinan.cpp"

class Kerajinan: public HasilKerajinan
{
    private:
        /* data */
        int harga;
        string fungsi;
    public:
        Kerajinan(){};

        void setHarga(int harga) {
            this->harga = harga;
        }

        void setFungsi(string fungsi) {
            this->fungsi = fungsi;
        }

        int getHarga() {
            return harga;
        }

        string getFungsi() {
            return fungsi;
        }

        ~Kerajinan(){};
};
