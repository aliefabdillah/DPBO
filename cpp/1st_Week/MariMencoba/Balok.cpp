#include <iostream>
#include <string>

using namespace std;

class Balok
{
    //properties balok
    private:
        int panjang;
        int lebar;
        int tinggi;
    
    public:


    //constructor
    Balok(){
    }

    Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    //method get
    int getPanjang(){ return panjang;}

    int getLebar(){ return lebar; }

    int getTinggi(){ return tinggi; }

    //method set
    void setPanjang(int p){ panjang = p; }

    void setLebar(int l){ lebar = l; }

    void setTinggi(int t){ tinggi = t; }

    //method volume
    int volume(){
        return panjang*lebar*tinggi;
    }

    int luasPermukaan(){
        return (2*panjang*lebar)+(2*lebar*tinggi)+(2*tinggi*panjang);
    }

    //destructor
    ~Balok(){
    }
};
