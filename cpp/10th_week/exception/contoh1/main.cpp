#include <iostream>
using namespace std;
#include "Eksepsi.cpp"

int main(){
    Eksepsi eks;
    int tabInt[10];

    cout << "Eksepsi Throw Standar" << endl;

    // standar exception
    try
    {
        eks.eksepsiThrowStandar(-1);
    }
    catch(exception::error e)
    {
        cout << e.p << endl;
    }
    cout << "--------------------" << endl;

    cout << "Exception throw sendiri" << endl;

    // eksepsi dengan kalimat sendiri
    try
    {
        eks.eksepsiThrowSendiri(-1);
    }
    catch(exception::error e)
    {
        cout << e.p << endl;
    }
    cout << "--------------------" << endl;
    
    cout << "Exception try catch" << endl;
    /* eksepsi try catch karena mengakases index array
    lebih dari jumlah panjang array */

    try
    {
        eks.eksepsiThrowIndexOutOfBounds(10,10,10, &tabInt[10]);
    }
    catch(exception::error e)
    {
        cout << e.p << endl;
    }
    cout << "--------------------" << endl;

    return 0;
    
}