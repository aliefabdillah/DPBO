#include <iostream>
#include <string>
#include "Manusia.cpp"
using namespace std;

class Karyawan : public Manusia
{
private:
    string no_pegawai;
    string jabatan;
    string departemen;
public:

    Karyawan(){};

    void setNomorPegawai(string nomor){
        this->no_pegawai = nomor;
    }

    void setJabatan(string jabatan){
        this->jabatan = jabatan;
    }
        
    void setDepartemen(string departemen){
        this->departemen = departemen;
    }

    string getNomorPegawai(){
        return this->no_pegawai;
    }

    string getJabatan(){
        return this->jabatan;
    }

    string getDepartemen(){
        return this->departemen;
    }

    ~Karyawan(){};
};