#include <cstdio>
#include <iostream>
using namespace std;

#include "Mesin.cpp"
#include "Titik.cpp"
#include "Tulis.cpp"

int main()
{
    Titik<int> t1(28, 1);
    string kata = "membahas template";
    
    tulisMasukan(18);
    tulisMasukan(29.11);
    tulisMasukan("Prosedur Tulis Masukan dengan string");

    keluaran(11, 11.82);   
    keluaran(9, 'a');   
    keluaran(9.88, 'a');

    keluaranO('A');   
    keluaranO(81);   
    keluaranO(82.81);   
    keluaranO(3, 5);   
    keluaranO(31.2, 5.2);

    cout  << "t1 : x : " << t1.getX() << " y : " << t1.getY() << endl;   
    return 0;
}

