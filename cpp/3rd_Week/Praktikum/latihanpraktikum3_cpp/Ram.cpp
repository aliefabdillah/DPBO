#include <iostream>
#include <string>

using namespace std;

class Ram
{
private:
    /* data */
    string ramCapacity;
    long ramPrice;
public:
    Ram() {}
    Ram(string capacity, long price) {
        this->ramCapacity = capacity;
        this->ramPrice = price;
    }

    void setRamCapacity(string c){ this->ramCapacity = c; }
    void setRamPrice(long p){ this->ramPrice = p; }

    string getRamCapacity(){ return this->ramCapacity; }
    long getRamPrice(){ return this->ramPrice; }

    /* method print ram */
    void printRam(){
        cout << "-Data RAM" << endl;
        cout << " RAM Capicity : " << this->ramCapacity << endl;
        cout << " RAM Price    : " << this->ramPrice << endl;
        cout << "-----------------------------------" << endl;
    }

    ~Ram() {}
};