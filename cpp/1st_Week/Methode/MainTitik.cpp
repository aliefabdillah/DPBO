#include "Titik.cpp"

using namespace std;

int main(){
    //membuat objek
    Titik t1;
    Titik t2(20, 10);

    t1.setX(10);
    t1.setY(15);

    cout << "t1: Nilai X:" << t1.getX() << endl;
    cout << "t1: Nilai y:" << t1.getY() << endl;

    cout << "t2: Nilai X:" << t2.getX() << endl;
    cout << "t2: Nilai y:" << t2.getY() << endl;

    return 0;   
}