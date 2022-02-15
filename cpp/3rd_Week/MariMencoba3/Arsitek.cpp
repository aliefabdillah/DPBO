#include <iostream>
#include <string>

using namespace std;

//inidividual class
class Arsitek {
    private:
        string kodeArsitek, namaArsitek, kantor, tahunBekerja;

//    constructor
    public:
        Arsitek(){}

    //    set dan get method
            //set method
        void setKodeArsitek(string kodeArsitek) {
            this->kodeArsitek = kodeArsitek;
        }

        void setNamaArsitek(string namaArsitek) {
            this->namaArsitek = namaArsitek;
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

        string getNamaArsitek() {
            return namaArsitek;
        }

        string getKantor() {
            return kantor;
        }

        string getTahunBekerja() {
            return tahunBekerja;
        }

        ~Arsitek(){};
};
