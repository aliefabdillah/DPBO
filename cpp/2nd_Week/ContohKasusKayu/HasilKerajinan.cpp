#include <iostream>
#include <string>

using namespace std;

class HasilKerajinan
{
    private:
        /* data */
        int kodeKerajinan;
        string bahan, namaKerajinan;
    public:
        HasilKerajinan(){};

        void setKodeKerajinan(int kodeKerajinan) {
            this->kodeKerajinan = kodeKerajinan;
        }

        void setBahan(string bahan) {
            this->bahan = bahan;
        }

        void setNamaKerajinan(string namaKerajinan) {
            this->namaKerajinan = namaKerajinan;
        }

        int getKodeKerajinan() {
            return kodeKerajinan;
        }

        string getBahan() {
            return bahan;
        }

        string getNamaKerajinan() {
            return namaKerajinan;
        }

        ~HasilKerajinan(){};

};
