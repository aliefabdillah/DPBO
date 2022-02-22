#include <iostream>
#include <string>

using namespace std;

class Processor
{
private:
    /* data */
    string name;
    long procPrice;
public:
    //contrutor
    Processor() {}
    Processor(string name, long price) {
        this->name = name;
        this->procPrice = price;
    }

    // set and get atribut
    void setName(string n){ this->name = n; }
    void setProcPrice(long p){ this->procPrice = p; }
    
    string getName(){ return this->name; }
    long getProcPrice(){ return this->procPrice; }

    //method print
    void printProcessor(){
        cout << "-Data Proccesor" << endl;
        cout << " Name            : " << this->name << endl;
        cout << " Proccesor Price : " << this->procPrice << endl;
        cout << "-----------------------------------" << endl;
    }
    ~Processor() {}
};