#include "Persegi.cpp"

int main(int argc, char const *argv[])
{
    Persegi opersegi;

    int luas1 = opersegi.luas(5,4);

    // call Bangun Datar Class
    BangunDatar oBangunDatar;
    int luas2 = oBangunDatar.luas();

    cout << luas1 << endl;
    cout << luas2 << endl;

    return 0;
}
