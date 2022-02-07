#include "Balok.cpp"
#include "Tabel.cpp"

using namespace std;

int main()
{
    int n = 0;
    cout << "Masukan Banyak Balok" << endl;
    cin >> n;

    Balok arrbalok[n];          //deklarasi array balok dari class balok

    int i=0, p=0, l=0, t=0;

    for ( i = 0; i < n; i++)
    {
        cout << "Masukan panjang, lebar, dan tinggi balok ke %d :" << i+1 << endl;
        cin >> p, l, t;
        arrbalok[i] = Balok(p, l, t);
    }
    
    Tabel tab(n, 5);

    for ( i = 0; i < n; i++)
    {
        string arrStr[5];
        arrStr[0] = to_string(arrbalok[i].getPanjang());
        arrStr[1] = to_string(arrbalok[i].getLebar());
        arrStr[2] = to_string(arrbalok[i].getTinggi());
        arrStr[3] = to_string(arrbalok[i].volume());
        arrStr[4] = to_string(arrbalok[i].luasPermukaan());
        tab.buatBaris(arrStr, 5);
    }
    
    return 0;
}
