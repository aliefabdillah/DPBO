#include <iostream>
#include <string>

using namespace std;

class Disk
{
private:
    /* data */
    string type, diskCapacity;
    long diskPrice;
public:
// contructor
    Disk() {}
    Disk(string type, string capacity, long diskPrice){
        this->type = type;
        this->diskCapacity = capacity;
        this->diskPrice = diskPrice;
    }

    // set and get atribut
    void setType(string t){ this->type = t; }
    void setDiskCapacity(string c){ this->diskCapacity = c; }
    void setDiskPrice(long p){ this->diskPrice = p; }
    
    string getType(){ return this->type; }
    string getDiskCapacity(){ return this->diskCapacity; }
    long getDiskPrice(){ return this->diskPrice; }

    //method print
    void printDisk(){
        cout << "-Data Disk" << endl;
        cout << " Type          : " << this->type << endl;
        cout << " Disk Capicity : " << this->diskCapacity << endl;
        cout << " Disk Price    : " << this->diskPrice << endl;
        cout << "-----------------------------------" << endl;
    }
    ~Disk() {}
};