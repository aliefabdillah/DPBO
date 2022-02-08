#include <iostream>
#include <string>
using namespace std;

class Manusia
{
    private:
        string name;
        string alamat;
        string no_ktp;
        string no_telepon;

    public:
        Manusia(){
        };

        //setter method
        void setNama(string name){
            this->name = name;
        }

        void setAlamat(string alamat){
            this->alamat = alamat;
        }

        void setNoKtp(string no_ktp){
            this->no_ktp = no_ktp;
        }

        void setNoTelepon(string no_telepon){
            this->no_telepon = no_telepon;
        }

        //getter method
        string getNama(){
            return this->name;
        }

        string getAlamat(){
            return this->alamat;
        }

        string getNoKtp(){
            return this->no_ktp;
        }
        
        string getNoTelepon(){
            return this->no_telepon;
        }

        ~Manusia(){
        };
};



