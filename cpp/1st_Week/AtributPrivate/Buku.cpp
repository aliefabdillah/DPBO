#include <iostream>
#include <string>

using namespace std;

class Buku
{
    private:
        string judul;
        string pengarang;
    public:
    //constructor kosong
    Buku(){
    };
        
    //constructor dengan properties
    Buku(string j, string p){
        judul = j;
        pengarang = p;
    }

    //fungsi setter/mengganti judul dengan masukan baru
    void setJudul(string j){
        judul = j;
    }

    void setPengarang(string p){
        pengarang = p;
    }

    //fungsi getter/mengakses data di properties
    string getJudul(){
        return judul;
    }

    string getPengarang(){
        return pengarang;
    }

    //destructor/free
    ~Buku(){
    };
};
