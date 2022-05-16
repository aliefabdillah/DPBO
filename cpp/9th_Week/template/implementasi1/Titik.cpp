#include "Titik.h"
using namespace std;

// template <class T>
// Titik<T>::Titik(){
//     // konstruktor
//     Titik<T>::x = 0;
//     Titik<T>::y = 0;
// }

template <class T>
Titik<T>::Titik(int xp, int yp){
    // konstruktor
    Titik<T>::x = xp;
    Titik<T>::y = yp;
}

template <class T>
int Titik<T>::getX(){
    return Titik<T>::x;
}

template <class T>
void Titik<T>::setX(int xp){
    Titik<T>::x = xp;
}

template <class T>
int Titik<T>::getY(){
    return Titik<T>::y;
}

template <class T>
void Titik<T>::setY(int yp){
    Titik<T>::y = yp;
}

template <class T>
Titik<T>::~Titik(){}
