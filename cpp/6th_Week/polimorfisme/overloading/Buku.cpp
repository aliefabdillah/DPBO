#include <iostream>
#include <string>

using namespace std;

class Buku
{
private:
    string judul;
    int tahun;
    string pengarang;
public:
    Buku() {}

    Buku(string judul, int tahun, string pengarang){
        this->judul = judul;
        this->tahun = tahun;
        this->pengarang = pengarang;
    }

    void setBuku(string judul){
        this->judul = judul;
    }

    void setBuku(string judul, int tahun){
        this->judul = judul;
        this->tahun = tahun;
    }

    void setBuku(string judul, int tahun, string pengarang){
        this->judul = judul;
        this->tahun = tahun;
        this->pengarang = pengarang;
    }

    void setJudul(string judul){
        this->judul = judul;
    }

    void setTahun(int tahun){
        this->tahun = tahun;
    }

    void setPengarang(string pengarang){
        this->pengarang = pengarang;
    }

    string getJudul(){
        return this->judul;
    }

    int getTahun(){
        return this->tahun;
    }

    string getPengarang(){
        return this->pengarang;
    }

    ~Buku() {}
};