#include <iostream>
#include <string>
using namespace std;

// method masukan
void tulisMasukan(int n){
    cout << "Masukan : " << n << endl;
}

void tulisMasukan(double n){
    cout << "Masukan : " << n << endl;
}

void tulisMasukan(string n){
    cout << "Masukan : " << n << endl;
}

template <class Masukan> void tulisMasukan(Masukan n){
    cout << "Masukan : " << n << endl;
}

// method keluaran
int keluaran(int n, double m){
    cout << "keluaran 2 tipe " << n << " dan " << m << endl;
    return n;
}

char keluaran(char n, int m){
    cout << "keluaran 2 tipe " << n << " dan "  << m << endl;
    return n;
}

double keluaran(double n, char m){
    cout << "keluaran 2 tipe " << n << " dan "  << m << endl;
    return n;
}

template <class A, class B> A keluaran(A n, B m){
    cout << "keluaran 2 tipe " << n << " dan "  << m << endl;
    return n;
}


template <class T>
T keluaranO(T n){
    cout << "Keluaran Overloading " << n << endl;
    return n;
}

template <class T>
T keluaranO(T x, T y){
    cout << "Keluaran Overloading " << x << " dan "  << y << endl;
    return (x * y);
}


