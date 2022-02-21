#include <iostream>
#include <string>
// #include "Processor.cpp"
// #include "Disk.cpp"
// #include "Ram.cpp"

class Pc
{
private:
    /* data */
    Processor procObj;
    Disk diskObj;
    Ram ramObj;
    long totalPrice;

public:
    Pc() {}
    Pc(Processor p, Disk d, Ram r) {
        this->procObj = p;
        this->diskObj = d;
        this->ramObj = r;
        // this->totalPrice = total;
    }

    void setProcObj(Processor p){ this->procObj = p; }
    void setDiskObj(Disk d){ this->diskObj = d; }
    void setRamObj(Ram r){ this->ramObj = r; }
    // void setTotalPrice(long total){ this->totalPrice = total; }

    Processor getProcObj(){ return this->procObj; }
    Disk getDiskObj(){ return this->diskObj; }
    Ram getRamObj(){ return this->ramObj; }
    // long getTotalPrice(){ return this->totalPrice; }

    // method
    void countTotal(){
        totalPrice = this->procObj.getProcPrice() + this->diskObj.getDiskPrice() + this->ramObj.getRamPrice();
    }

    void printPc(){
        this->procObj.printProcessor();
        this->diskObj.printDisk();
        this->ramObj.printRam();
        cout << "-Data PC" << endl;
        cout << " Harga PC : " << this->totalPrice << endl;
        cout << "-----------------------------------" << endl;
    }

    ~Pc() {}
};
