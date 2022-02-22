#include <iostream>
#include <string>

using namespace std;

class TokoBangunan
{
private:
    /* data */
    string kodeToko, namaToko, alamatToko;
public:
    TokoBangunan() {}
    TokoBangunan(string kodeToko, string namaToko, string alamatToko){
        this->kodeToko = kodeToko;
        this->namaToko = namaToko;
        this->alamatToko = alamatToko;
    }

    //  get and set kodetoko
    string getKodeToko() {
        return kodeToko;
    }

    void setKodeToko(string kodeToko) {
        this->kodeToko = kodeToko;
    }

//    get and set nama toko
    string getNamaToko() {
        return namaToko;
    }

    void setNamaToko(string namaToko) {
        this->namaToko = namaToko;
    }

//    get and set alamat toko
    string getAlamatToko() {
        return alamatToko;
    }

    void setAlamatToko(string alamatToko) {
        this->alamatToko = alamatToko;
    }
    
    ~TokoBangunan() {}
};