#include <iostream>
#include <string>

using namespace std;

class Person
{
private:
    /* Atribut */
    string name;
    Birthday bObj;
public:
    // konstruktor
    Person() {}
    Person(string n, Birthday b){
        this->name = n;
        this->bObj = b;
    }

    // setter and getter
    void setName(string n){ this->name = n; }
    void setBday(Birthday b) { this->bObj = b; }

    string getName(){ return this->name; }
    Birthday getBday(){ return this->bObj; }

    void printPerson(){
        cout << "The Person's name is " << this->name << endl;
        this->bObj.printBirthday();
    }
    ~Person() {}
};