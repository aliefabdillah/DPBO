#include <iostream>
#include "Titik.cpp"
#include "Titik3D.cpp"

using namespace std;

void tampilTitik(Titik t1, Titik3D t2){
    cout << "Fungsi Friend" << endl;
    cout << "Titik : X = " << t1.x << "  y = " << t1.y << endl;
    cout << "Titik3D : x = " << t2.x << "  y = " << t2.y << " z = " << t2.getZ() << endl;
    cout << "---------------------------------------------------------------" << endl;
}

int main(){
    Titik t1(28, 1);
    Titik3D t2 (28, 1, 7);

    tampilTitik(t1, t2);

    return 0;
}