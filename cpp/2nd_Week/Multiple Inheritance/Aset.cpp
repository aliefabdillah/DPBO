#include <iostream>
using namespace std;

class Aset
{
    private:
       int kodeAset;
       int jenisAset;
       double nilaiAset;
    public:
       Aset(){
       };

       void setKodeAset(int kodeAset){
           this->kodeAset = kodeAset;
       }

       void setJenisAset(int jenisAset){
           this->jenisAset = jenisAset;
       }

       void setNilaiAset(double nilaiAset){
           this->nilaiAset = nilaiAset;
       }

       int getKodeAset(){
           return this->kodeAset;
       }

       int getjenisAset(){
           return this->jenisAset;
       }

       double getNilaiAset(){
           return this->nilaiAset;
       }

        ~Aset(){
        };
};
