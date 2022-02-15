#include "Manusia.cpp"

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
