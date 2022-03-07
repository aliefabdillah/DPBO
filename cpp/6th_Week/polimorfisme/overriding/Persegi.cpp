#include "BangunDatar.cpp"

class Persegi: public BangunDatar
{
private:
public:
    Persegi() {}

    int luas(int p, int l){
        return p * l;
    }
    
    ~Persegi() {}
};