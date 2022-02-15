#include "Pengusaha.cpp"

class Pengerajin: public Pengusaha
{
    private:
        /* data */
        long omsetPerBulan;
        string deskripsi, noKTP;
    public:
        Pengerajin(){};

        Pengerajin(string noKTP, long omsetPerBulan, string deskripsi){
            this->noKTP = noKTP;
            this->omsetPerBulan = omsetPerBulan;
            this->deskripsi = deskripsi;
        }

        void setNoKTP(string noKTP) {
            this->noKTP = noKTP;
        }

        void setOmsetPerBulan(double omsetPerBulan) {
            this->omsetPerBulan = omsetPerBulan;
        }

        void setDeskripsi(string deskripsi) {
            this->deskripsi = deskripsi;
        }

        string getNoKTP() {
            return noKTP;
        }

        long getOmsetPerBulan() {
            return omsetPerBulan;
        }

        string getDeskripsi() {
            return deskripsi;
        }

        ~Pengerajin(){};
};


