#include <iostream>
#include <string>

class Birthday
{
private:
    // atribut
    int day;
    int month;
    int year;
public:
    // konstruktor
    Birthday() {}
    Birthday(int d, int m, int y) {
        this->day = d;
        this->month = m;
        this->year = y;
    }

    // setter and getter
    void setDay(int d){ this->day = d; }
    void setMonth(int m){ this->month = m; }
    void setYear(int y){ this->year = y; }

    int getDay(){ return this->day; }
    int getMont(){ return this->month; }
    int getYear(){ return this->year; }
    
    // method
    void printBirthday(){
        cout << "Their Birthday is " << this->day << "/" << this->month << "/" << this->year << endl;
    }

    //destructor
    ~Birthday() {}
};