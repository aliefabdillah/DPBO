#include <iostream>
#include <string>
using namespace std;

template <class T>
class Tulis
{
private:
    /* data */
public:
    Tulis(T kata) {
        // konstruktor
        cout << "isi kata masukan : " << kata << endl;
    }
};