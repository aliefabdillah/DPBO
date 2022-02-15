#include <iostream>
#include <string>

using namespace std;

class Kayu
{
    private:
        string kodeKayu;
        string jenisPohon;
        int berat;
        int volume;
    public:
        Kayu(){};

        void setKodeKayu(string kodeKayu){
            this->kodeKayu = kodeKayu;
        }

        void setJenisPohon(string jenisPohon){
            this->jenisPohon = jenisPohon;
        }

        void setBerat(int berat){
            this->berat = berat;
        }
        
        void setVolume(int volume){
            this->volume = volume;
        }

        string getKodeKayu(){
            return this->kodeKayu;
        }

        string getJenisPohon(){
            return this->jenisPohon;
        }

        int getBerat(){
            return this->berat;
        }

        int getVolume(){
            return this->volume;
        }

        ~Kayu(){};
};

